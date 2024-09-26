package javabase;

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
public class ObjectType1 {

    public static void test1() {
        Integer integer1 = 127;
        Integer integer2 = 128;
        Integer integer3 = 128;
        Integer integer4 = 127;
        System.out.println("与常量比较，直接比较值是否相等");
        System.out.println(integer1 == 127);
        System.out.println(integer2 == 128);
        System.out.println(integer2.equals(128));

        System.out.println("与封装类型比较，比较地址是否相等,但是 -128-127有缓存");
        System.out.println(integer3 == integer2);
        System.out.println(integer3.equals(integer2));
        System.out.println(integer4 == integer1);

        Double double1 = 127.0;
        Long long1 = 127L;
        System.out.println("不同类型比较大小测试");
        System.out.println(integer1.equals(double1));
        System.out.println(integer1.equals(long1));
        System.out.println(double1.equals(long1));

    }

    public static void main(String[] args) {
        test1();
    }
}
