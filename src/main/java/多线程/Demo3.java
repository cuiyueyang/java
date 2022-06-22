package 多线程;

/**
 * Created by cuiyueyang on 2020/5/25.
 */
class MyThread3 implements Runnable{
    public void run(){
        for (int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"运行，i="+i);
        }
    }
}

public class Demo3 {
    //取得和设置线程的名称
    public static void main(String[] args) {
        MyThread3 myThread = new MyThread3();
        new Thread(myThread).start();
        new Thread(myThread,"线程A").start();
    }
}
