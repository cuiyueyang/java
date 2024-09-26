package array;

import java.util.Arrays;

/**
 * Description：数组排序
 * Created by cuiyueyang on 2020/5/26.
 */
public class SortTest {
    public static void main(String[] args) {
        int[] ext1 = {1,2,5,4,3};
        sort1(ext1);
        sort2(ext1);
    }

    /**
     * 冒泡排序
     * @param ext1
     */
    private static void sort2(int[] ext1) {
        //冒泡排序
        for (int i = 0; i < ext1.length; i++){
            for (int j = i; j < ext1.length-1; j++){
                if (ext1[j] > ext1[j+1]){
                    int temp = ext1[j];
                    ext1[j] = ext1[j+1];
                    ext1[j+1] = temp;
                }
            }
        }
        System.out.println("-----冒泡排序---");
        for (int ext : ext1){
            System.out.println(ext);
        }
    }

    /**
     * 数组排序-sort
     * @param ext1
     */
    private static void sort1(int[] ext1) {
        //数组的sort方法排序，集合也可以用sort方法排序
        Arrays.sort(ext1);
        System.out.println("-----sort排序---");
        //将数组中的元素全部打印出来
        for (int ext : ext1){
            System.out.println(ext);
        }
    }

}
