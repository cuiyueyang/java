package str;

/**
 * <p>Description: 字符串大小写转换</p>
 * <p>@date 2021/12/17 11:21</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo4 {
    public static void main(String[] args) {
        //1. 字符串全转换大写toUpperCase()
        String str1="123abcABC哈哈，。】";
        System.out.println("字符串全转换大写前为："+str1);
        System.out.println("字符串全转换大写toUpperCase()为："+str1.toUpperCase());


        //2. 字符串全转换小写toLowerCase()
        String str2="123abcABC哈哈，。】";
        System.out.println("字符串全转换小写前为："+str2);
        System.out.println("字符串全转换小写toLowerCase()为："+str2.toLowerCase());
    }
}
