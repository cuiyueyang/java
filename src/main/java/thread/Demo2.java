package thread;

/**
 * Created by cuiyueyang on 2020/5/25.
 */
class MyThread2 extends Thread{
    private String name;
    public MyThread2(String name){
        this.name=name;
    }
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(name+"运行，i="+i);
        }
    }
}

//Thread类
public class Demo2 {
    public static void main(String[] args) {
        MyThread2 mt1 = new MyThread2("线程A");
        MyThread2 mt2 = new MyThread2("线程B");
        mt1.start();
        mt2.start();
        System.out.println(Thread.currentThread().getName());
    }
}
