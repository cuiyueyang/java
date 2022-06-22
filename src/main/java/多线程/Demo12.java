package 多线程;

/**
 * Created by cuiyueyang on 2020/5/25.
 */
class Zhangsan{
    public void say(){
        System.out.println("张三对李四说：你给我画，我就把书给你");
    }
    public void get(){
        System.out.println("张三得到画了");
    }
}

class Lisi{
    public void say(){
        System.out.println("李四对张三说，你给我书，我就给你画");
    }
    public void get(){
        System.out.println("李四得到书了");
    }
}

public class Demo12 implements Runnable{
    private static Zhangsan zs = new Zhangsan();
    private static Lisi ls = new Lisi();
    private boolean flag = false;
    public void run(){
        if (flag){
            synchronized (zs){
                zs.say();
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (ls){
                    zs.get();
                }
            }
        }else{
            synchronized (ls){
                ls.say();
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (zs){
                    ls.get();
                }
            }
        }
    }

    /**
     * 死锁
     * @param args
     */
    public static void main(String[] args) {
        Demo12 t1 = new Demo12();
        Demo12 t2 = new Demo12();
        t1.flag=true;
        t2.flag=false;
        Thread thA = new Thread(t1);
        Thread thB = new Thread(t2);
        thA.start();
        thB.start();
    }
}

