package 多线程;

/**
 * Created by cuiyueyang on 2020/5/25.
 */
class MyThread4 implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"运行，i="+i);
        }
    }
}

/**
 * join() 让一个线程强制运行，线程强制运行期间，其他线程无法运行
 */
public class Demo4 {
    public static void main(String[] args) {
        MyThread4 mt = new MyThread4();
        Thread t = new Thread(mt,"线程");
        t.start();
        for (int i = 0;i < 10; i++){
            if(i > 5){
                try {
                    t.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Main线程运行-》"+i);
        }
    }
}
