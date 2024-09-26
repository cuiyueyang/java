package test.test;

/**
 * <p>Description: </p>
 * <p>@date 2022/2/8 15:34</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test7 {
    public static void main(String args[]) {
        Thread t=new Thread(){
            public void  run(){
                dianping();

            }
        };
        t.run();
        System.out.print("dazhong");
    }
    static void dianping(){
        System.out.print("dianping");
    }
}
