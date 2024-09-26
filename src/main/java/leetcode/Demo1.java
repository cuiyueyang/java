package leetcode;


import org.apache.commons.compress.utils.Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>Description: 数组自带排序</p>
 * <p>Date: 2021/5/31 18:06 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo1 {

    public Integer[] sort1(Integer[] arr) {
        //升序
        Arrays.sort(arr);
        //降序
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {4,1,3,2};
        Demo1 demo1 = new Demo1();
        demo1.sort1(arr1);
        for (int arr : arr1) {
            System.out.println(arr);
        }

        List<Integer>  list = Lists.newArrayList();

    }

}
