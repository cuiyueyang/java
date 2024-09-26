package thread;

/**
 * Created by cuiyueyang on 2020/5/25.
 */

import java.time.LocalDateTime;

/**
 * 实现多线程的四种方式
 * 1.实现Runnable接口
 * 2.继承Thread类
 * 3.实现Callable接口（实现的是call方法，有返回值，需要实现FutureTask 进行接受）
 * 4.使用线程池创建
 *
 *     线程的五种状态：1.新建（new）2.就绪（start）3.运行（run）4.阻塞（）5.死亡
 *
 *     1.wait()和sleep()的区别
 *     sleep()没有释放锁，wait()释放了锁，使得其他线程可以使用同步控制块和方法
 *     wait()只能在同步方法块中使用，sleep可以在任何地方使用
 *     sleep()可以指定时间醒来，时间不到可以用interreput()强行打断，wait()可以用notify()直接唤醒
 *     sleep()是Thread的执行方法,wait是Objectd的方法
 *     sleep()是让某个线程暂时停运一段时间，其控制范围由当前线程决定，wait()由某个确定的对象进行调用
 */

class MyThread implements Runnable{
    private String name;
    public MyThread(String name){
        this.name=name;
    }
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(name+"运行,i="+i);
        }
    }
}

//Runnable接口
public class Demo1 {
    public static void main(String args[]) {
        System.out.println(LocalDateTime.now());
        MyThread mt1 = new MyThread("线程A");
        MyThread mt2 = new MyThread("线程B");
        Thread t1=new Thread(mt1);
        Thread t2=new Thread(mt2);
        t1.start();
        t2.start();
        System.out.println(LocalDateTime.now());
    }
}
