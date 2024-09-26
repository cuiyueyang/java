package str;

/**
 * Description：字符串是否相等比较
 * Created by cuiyueyang on 2020/5/25.
 */

public class Demo2 {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "ab";
        System.out.println(str1==str2);
        String str3 = "ab" + "ab";
        String str4 = str1 + str2;
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
    }
}
