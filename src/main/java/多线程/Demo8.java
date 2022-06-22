package 多线程;

/**
 * Created by cuiyueyang on 2020/5/25.
 */
class MyThread8 implements Runnable{
    public void run(){
        for (int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"运行，i="+i);
        }
    }
}

/**
 * 线程的优先级
 */
public class Demo8 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread8(),"线程A");
        Thread t2 = new Thread(new MyThread8(),"线程B");
        Thread t3 = new Thread(new MyThread8(),"线程C");
        //线程优先级
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
