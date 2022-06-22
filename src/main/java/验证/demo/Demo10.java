package 验证.demo;

/**
 * <p>Description: 数字转换，比较</p>
 * <p>Date: 2021/8/4 15:31 </p>
 *
 * @version v1.0.0
 * @author: cuiyy
 */
public class Demo10 {
    public static void main(String[] args) {
        long a = 8875L;
        System.out.println(a/2);

        Integer i = 42;
        Long l = 42l;
        Double d = 42.0;
        System.out.println(i.equals(l));
        System.out.println(i.equals(d));
        System.out.println(l.equals(d));
        System.out.println(l.equals(42L));
    }
}
