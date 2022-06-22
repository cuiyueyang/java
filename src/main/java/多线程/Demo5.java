package 多线程;

/**
 * Created by cuiyueyang on 2020/5/25.
 */
class MyThread5 implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++){
            if (i == 3) {
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"运行，i="+i);
        }
    }
}

/**
 * 线程的休眠
 */
public class Demo5 {
    public static void main(String[] args) {
        MyThread5 mt = new MyThread5();
        Thread t=  new Thread(mt,"线程1");
        t.start();
        Thread t2=  new Thread(mt,"线程2");
        t2.start();

    }
}
