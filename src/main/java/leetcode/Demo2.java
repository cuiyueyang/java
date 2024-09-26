package leetcode;

import java.util.Arrays;

/**
 * <p>Description: 冒泡排序</p>
 * <p>Date: 2021/6/8 09:10 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo2 {
    public static void maoPao(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                int temp = arr[j];
                if (arr[j] > arr[j+1]) {
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,1};
        maoPao(arr);
        Arrays.stream(arr).forEach(s -> System.out.println(s));
    }

}
