package 多线程;

/**
 * Created by cuiyueyang on 2020/5/25.
 */
class MyThread10 implements Runnable{
    private int ticket = 5;
    public void run(){
        for (int i=0;i<100;i++){
            //同步
            synchronized (this){
                if (ticket>0){
                    try {
                        Thread.sleep(300);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票：ticket="+ticket--);
                }
            }
        }
    }
}

/**
 * 同步以及死锁
 */
public class Demo10 {
    public static void main(String[] args) {
        MyThread10 mt = new MyThread10();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();
    }
}
