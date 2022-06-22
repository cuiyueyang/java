package asiainfo;

/**
 * Created by cuiyueyang on 2019/12/31.
 */
public class 全局变量 {
    private static String a = "1";

    public static void test1(){
        a="2";
    }

    public static void main(String[] args) {
        test1();
        System.out.println(a);
    }
}
