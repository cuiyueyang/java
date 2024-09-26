package leetcode;

/**
 * <p>Description: 字形变换</p>
 * <p>@date 2022/7/4 16:06</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class LC6 {
    public static String convert(String s, int numRows) {
        String result = "";
        if (s == "") {
            result = s;
        } else {
            int length = s.length();
            if (numRows == 0) {
                result = s;
            } else if (numRows > length) {
                result = s;
            } else {
                String[] strs = new String[numRows];
                int a = length / (numRows + 1);
                int b = length % numRows;
                for (int i = 0; i < a; i = i + 2) {

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        convert("abcdef", 3);
    }
}
