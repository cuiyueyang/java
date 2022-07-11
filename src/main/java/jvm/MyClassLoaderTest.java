package jvm;

import java.io.FileInputStream;
import java.lang.reflect.Method;

/**
 * <p>Description: 手写类加载器</p>
 * <p>@date 2022/7/6 13:57</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class MyClassLoaderTest {

    static class MyClassLoader extends ClassLoader {
        private String classPath;

        public MyClassLoader (String classPath) {
            this.classPath = classPath;
        }

        private  byte[] loadByte(String name) throws Exception {
            name = name.replaceAll("\\.", "/");
            FileInputStream fis = new FileInputStream("/" + name +".class");
            int len = fis.available();
            byte[] data = new byte[len];
            fis.read(data);
            fis.close();
            return data;
        }

        protected Class<?> findClass(String name) throws ClassNotFoundException {
            try {
                byte[] data = loadByte(name);
                return defineClass(data, 0, data.length);
            } catch (Exception e) {
                e.printStackTrace();
                throw new ClassNotFoundException();
            }
        }

        //重写，打破双亲委派机制
        protected Class<?> loadClass(String name, boolean resolve)
                throws ClassNotFoundException
        {
            synchronized (getClassLoadingLock(name)) {
                // First, check if the class has already been loaded
                Class<?> c = findLoadedClass(name);
                if (c == null) {
                    long t0 = System.nanoTime();
                    //如果为空直接加载
                    if (c == null) {
                        // If still not found, then invoke findClass in order
                        // to find the class.
                        long t1 = System.nanoTime();

                        if (!name.startsWith("Entity")) {
                            c = this.getParent().loadClass(name);
                        } else {
                            c = findClass(name);
                        }

                        // this is the defining class loader; record the stats
                        sun.misc.PerfCounter.getParentDelegationTime().addTime(t1 - t0);
                        sun.misc.PerfCounter.getFindClassTime().addElapsedTimeFrom(t1);
                        sun.misc.PerfCounter.getFindClasses().increment();
                    }
                }
                if (resolve) {
                    resolveClass(c);
                }
                return c;
            }
        }

        public static void main(String[] args) throws Exception {
            //初始化自定义类加载器，会先初始化父类ClassLoader，其中会把自定义类加载器的父加载器设置为应用程序类加载器AppClassLoader
            MyClassLoader classLoader = new MyClassLoader("F:\\temp");
            Class clazz = classLoader.loadClass("Entity.Student");
            Object obj = clazz.newInstance();
            Method method = clazz.getDeclaredMethod("toString", null);
            method.invoke(obj, null);
            System.out.println(clazz.getClassLoader().getClass().getName());
        }

    }

}
