package 验证.test;

/**
 * <p>Description: </p>
 * <p>@date 2022/1/18 14:07</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test6 {
    public static void main(String[] args) {
        int i = 3;
        i--;
        int b = i++ + ++i;
        System.out.println(i);
        System.out.println(b);
    }
}
