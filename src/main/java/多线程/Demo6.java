package 多线程;

/**
 * Created by cuiyueyang on 2020/5/25.
 */
class MyThread6 implements Runnable{
    public void run(){
        System.out.println("1.进入run()方法");
        try{
            System.out.println("休眠2");
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("3.休眠被终止");
            return;
        }
        System.out.println("4.run()方法正常结束");
    }
}

/**
 * 中断线程
 */
public class Demo6 {
    public static void main(String[] args) {
        MyThread6 myThread6 = new MyThread6();
        Thread t = new Thread(myThread6,"线程");
        t.start();
        try {
            System.out.println("休眠1");
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("3.休眠被终止");
        }
        System.out.println("唤醒1");
        //线程中断
        t.interrupt();
    }
}
