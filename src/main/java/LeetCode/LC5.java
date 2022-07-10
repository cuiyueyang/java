package LeetCode;

import org.jsoup.internal.StringUtil;

/**
 * <p>Description: 回文子串</p>
 * <p>@date 2022/6/29 10:09</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class LC5 {


    /**
     * 奇数长度：中间的字母不用管，两侧的各自相等。
     * 偶数长度：没有中间的字母，两侧的各自相等
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if (!StringUtil.isBlank(s)) {
            String result = "";
            int resultSize = 1;
            int length = s.length();
            int start = 0;
            //偶数
            for (int j = 0; j < length-1; j++) {
                int tempSize = 1;
                for (int i = 1; j+i < length && j-i+1 >= 0; i++) {
                    int index1 = s.charAt(j-i+1);
                    int index2 = s.charAt(j+i);
                    if (index1 == index2) {
                        if (tempSize == 1) {
                            tempSize = 2;
                            if (tempSize > resultSize) {
                                resultSize = tempSize;
                                start = j-i+1;
                            }
                        } else {
                            tempSize += 2;
                            if (tempSize > resultSize) {
                                resultSize = tempSize;
                                start = j-i+1;
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
            //奇数
            for (int j = 1; j < length-1; j++) {
                int tempSize = 1;
                for (int i = 1; j-i >= 0 && j+i < length; i++) {
                    int index1 = s.charAt(j-i);
                    int index3 = s.charAt(j+i);
                    if (index1 == index3) {
                        if (tempSize == 1) {
                            tempSize = 3;
                            if (tempSize > resultSize) {
                                resultSize = tempSize;
                                start = j-i;
                            }
                        } else {
                            tempSize += 2;
                            if (tempSize > resultSize) {
                                resultSize = tempSize;
                                start = j-i;
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
            for (int e = 0; e < resultSize; e++) {
                result += s.substring(start + e, start + e + 1);
            }
            return result;
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bbbb"));
    }

}
