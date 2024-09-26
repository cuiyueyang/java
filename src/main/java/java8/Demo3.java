package java8;

/**
 * @Author: cuiyy
 * @Date: 2021/3/15 23:40
 * @Email: 13333956278@163.com
 */
public class Demo3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("获取线程1名称：" + Thread.currentThread().getName() + ",子线程");
            }
        }).start();

        new Thread(() -> System.out.println("获取线程2名称：" + Thread.currentThread().getName() + ",子线程")).start();
    }
}
