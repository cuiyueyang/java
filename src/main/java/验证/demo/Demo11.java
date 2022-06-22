package 验证.demo;

/**
 * <p>Description: 字符串之间相互赋值</p>
 * <p>@date 2022/2/9 11:06</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo11{
    public static void main (String [] args) {
        String lx = "LeXin";
        String nb = lx;
        lx = "Fenqile";
        System.out.println(nb);
    }
}
