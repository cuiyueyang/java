package 基础概念;

/**
 * <p>Description: 基本数据类型封装类型的大小比较问题 </p>
 * <p>@date 2021/11/1 16:17</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/

/**
 * Integer 类型是包装类，所以直接 == 返回false,但是由于内部封装了 cache方法，-128-127的数据会进行缓存，
 * 所以直接相等。
 * Integer 和 int 类型比较，会先把 Integer 类型转化为 int 类型，所以返回true.
 */
public class SjType2 {

    private static final Integer SUCCESS_CODE = 100;
    private static final Integer SUCCESS_CODE2 = 1000;

    private static final Long sa1 = 100L;
    private static final Long sa2 = 1000L;

    public void test1() {
        String a = "100";
        Integer b = 100;
        Integer c = 1000;
        if (SUCCESS_CODE == b) {
            System.out.println("a1");
        }
        if (SUCCESS_CODE.equals(b)) {
            System.out.println("a2");
        }
        if (SUCCESS_CODE.equals(a)) {
            System.out.println("a3");
        }
        if (SUCCESS_CODE2.equals(c)) {
            System.out.println("a4");
        }
        if (SUCCESS_CODE2 == c) {
            System.out.println("a5");
        }
        if (1000 == c) {
            System.out.println("a6");
        }
        Integer.valueOf(1);
        Double.valueOf(0.0);
        Long.valueOf(1);
        Long a1 = 100L;
        Long a2 = 1000L;
        if (a1 == sa1) {
            System.out.println("la1");
        }
        if (a2 == sa2) {
            System.out.println("la2");
        }
    }

    public static void main(String[] args) {
        SjType2 test2 = new SjType2();
        test2.test1();
    }
}
