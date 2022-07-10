package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * <p>Description: 两数之和</p>
 * <p>@date 2022/6/27 10:05</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class LC1 {

    /**
     * 普通解法：双循环
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

    /**
     * 链表解法：单循环，把每个数的差保存起来，看数组中时候存在这种数字
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        int[] res = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                res[0] = target - nums[i];
                res[1] = nums[i];
                break;
            }
            list.add(target - nums[i]);
        }
        return res;
    }

    /**
     * hashMap解法：单循环，原理和链表一样，因为hash表的缘故效率更高
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum3(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])) {
                res[0] = map.get(nums[i]);
                res[1] = i;
            }
            map.put(target - nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        LC1 lc1 = new LC1();
        int[] nums = {20,22,2,3,4,5,9,11,13,14,15,16};
        Long start = System.currentTimeMillis();
        lc1.twoSum1(nums, 17);
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
