package 小工具测试;

/**
 * <p>Description: Math 的一些方法</p>
 * <p>@date 2022/2/9 11:17</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class MathTest {
    public static void main(String[] args) {
        double d1=-0.5;
        //四舍五入  负数情况 0.5 -》 +1 -》0
        System.out.println("round d1="+Math.round(d1));
        //向上取整
        System.out.println("Ceil d1="+Math.ceil(d1));
        //向下取整
        System.out.println("floor d1="+Math.floor(d1));
        int a = '2';
        System.out.println(a);
    }
}
