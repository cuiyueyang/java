package LeetCode;

/**
 * <p>Description: 无重复字符的最长子串</p>
 * <p>@date 2022/6/28 10:49</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class LC3 {

    public static int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            //得到字符串某一位置的字符
            int index = s.charAt(i);
            //判断值是否重复出现
            start = Math.max(start, last[index] + 1);
            //判断连续大小
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abccdef"));
    }

}
