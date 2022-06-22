package 正则表达式;

/**
 * <p>Description: </p>
 * <p>Date: 2021/6/10 15:17 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo1 {


    /**
     * 数字的正则表达式--只能输入非零的正整数
     */
    private static String numRegex1 = "^\\+?[1-9][0-9]*$";

    /**
     * 数字
     */
    private static String numRegex2 = "^[0-9]*$";

    /**
     *至少n位的数字
     */
    private static String numRegex3 = "^\\d{n,}$";

    public static void main(String[] args) {
        String num = "1000000000ds";
        if (num.matches(numRegex1)) {
            System.out.println("hello");
        }
    }

}
