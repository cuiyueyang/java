package thread;

/**
 * Created by cuiyueyang on 2020/5/25.
 */
class MyThread9 implements Runnable{
    public void run(){
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            }catch (Exception e){

            }
            System.out.println(Thread.currentThread().getName()+"运行，i="+i);
            if (i==2){
                System.out.println("线程的礼让");
                //线程的礼让
                Thread.currentThread().yield();
            }
        }
    }
}

/**
 * 线程的礼让
 */
public class Demo9 {
    public static void main(String[] args) {
        MyThread9 my = new MyThread9();
        Thread t1 = new Thread(my,"线程A");
        Thread t2 = new Thread(my,"线程B");
        t1.start();
        t2.start();
    }
}
