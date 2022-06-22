package 验证.test;

/**
 * <p>Description: </p>
 * <p>@date 2022/3/31 16:23</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test17 {

    public static void main(String[] args) {
        System.out.println(test());
    }

    public static String test() {
        String str = "";
        try {
            System.out.println("a");
            //System.exit(0)会打断程序
//            System.exit(0);
            str = "a";
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //finally中的return会覆盖try中的return   finally在try的return 后执行 return返回地结果会被保存起来
            str = "b";
            System.out.println(str);
        }
        return "b";
    }

}
