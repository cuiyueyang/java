package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>Description: </p>
 * <p>@date 2022/6/28 14:21</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class LC4 {

    public static double findMedianSortedArrays(int[] nums11, int[] nums12) {
        Integer nums1[] = Arrays.stream(nums11).boxed().toArray(Integer[]::new);
        Integer nums2[] = Arrays.stream(nums12).boxed().toArray(Integer[]::new);
        double result = 0.0;
        Integer size = nums1.length + nums2.length;
        List<Integer> list1 = Arrays.asList(nums1);
        List<Integer> list2 = Arrays.asList(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        list.sort((s1,s2) -> s1 - s2);
        int num1 = size/2;
        if (0 == size%2) {
            result = (Double.valueOf(list.get(num1-1)) + Double.valueOf(list.get(num1)))/2;
        } else {
            result = Double.valueOf(list.get(num1));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ext1 = {1,2};
        int[] ext2 = {3,4};
        System.out.println(findMedianSortedArrays(ext1,ext2));
    }

}
