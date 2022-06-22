package 多线程;

/**
 * Created by cuiyueyang on 2020/5/25.
 */
class MyThread7 implements Runnable{
    public void run(){
        while (true){
            System.out.println(Thread.currentThread().getName()+"在运行。");
        }
    }
}

/**
 * 后台线程
 */
public class Demo7 {
    public static void main(String[] args) {
        MyThread7 myThread7 = new MyThread7();
        Thread t = new Thread(myThread7,"线程");
        t.setDaemon(true);
        t.start();
    }
}
