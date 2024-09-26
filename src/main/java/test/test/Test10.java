package test.test;

/**
 * <p>Description: </p>
 * <p>@date 2022/2/9 15:59</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test10 {
    public static void main(String[] args) {
        String s1 = "xiaopeng" ;
        String s2 = "xiaopeng" ;
        String s3 =new String (s1);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }
}
