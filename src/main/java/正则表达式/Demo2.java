package 正则表达式;

/**
 * <p>Description: </p>
 * <p>Date: 2021/7/20 13:32 </p>
 *
 * @version v1.0.0
 * @author: cuiyy
 */
public class Demo2 {

    /**新能源+普通车*/
    private final static String REGEX = "([京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼]{1}(([A-HJ-Z]{1}[A-HJ-NP-Z0-9]{5})|([A-HJ-Z]{1}(([DF]{1}[A-HJ-NP-Z0-9]{1}[0-9]{4})|([0-9]{5}[DF]{1})))|([A-HJ-Z]{1}[A-D0-9]{1}[0-9]{3}警)))|([0-9]{6}使)|((([沪粤川云桂鄂陕蒙藏黑辽渝]{1}A)|鲁B|闽D|蒙E|蒙H)[0-9]{4}领)|(WJ[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼·•]{1}[0-9]{4}[TDSHBXJ0-9]{1})|([VKHBSLJNGCE]{1}[A-DJ-PR-TVY]{1}[0-9]{5})";
    /**新能源车牌校验*/
    private final static String REGEX_NEW = "[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}(([0-9]{5}[DF])|([DF][A-HJ-NP-Z0-9][0-9]{4}))";
    /**普通车牌校验*/
    private final static String REGEX_NORMAL = "[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-HJ-NP-Z0-9]{4}[A-HJ-NP-Z0-9挂学警港澳]{1}";

    public static void main(String[] args) {
        String num1 = "豫E12345";
        String num2 = "豫E12345D";

        if (num1.matches(REGEX_NORMAL)) {
            System.out.println(num1);
        }

        if (num2.matches(REGEX_NORMAL)) {
            System.out.println(num2);
        }

    }

}
