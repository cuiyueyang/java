package test.test;

/**
 * <p>Description: </p>
 * <p>@date 2022/3/31 16:33</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test18 {

    static{
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Long a = 1L;
        Long b = 3L;
        System.out.println(Double.valueOf(a)/Double.valueOf(b));
        System.out.println(a*100/b);
    }
}
