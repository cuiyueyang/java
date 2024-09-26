package thread;

/**
 * Created by cuiyueyang on 2020/5/25.
 */
class MyThread11 implements Runnable{
    private int ticket = 5;
    public void run(){
        for (int i=0;i<100;i++){
            this.sale();
        }
    }
    public synchronized void sale(){
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

/**
 * 线程同步锁
 */
public class Demo11 {
    public static void main(String[] args) {
        MyThread11 myThread11 = new MyThread11();
        Thread thread1 = new Thread(myThread11);
        Thread thread2 = new Thread(myThread11);
        Thread thread3 = new Thread(myThread11);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
