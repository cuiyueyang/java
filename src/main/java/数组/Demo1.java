package 数组;

import java.util.Arrays;

/**
 * Description：数组排序
 * Created by cuiyueyang on 2020/5/26.
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] ext1 = {1,2,5,4,3};
        for (int ext:ext1){
            System.out.println(ext);
        }
        System.out.println("-----------");
        //数组的sort方法排序，集合也可以用sort方法排序
        Arrays.sort(ext1);
        for (int a = 0;a<ext1.length;a++){
            System.out.println(ext1[a]);
        }
        System.out.println("------------");
        int[] ext2 = new int[2];
        ext2[0] = 1;
        for (int ext:ext2){
            System.out.println(ext);
        }
        System.out.println("--------------");
        //冒泡排序
        for (int i=0;i<ext1.length;i++){
            for (int j=i;j<ext1.length-1;j++){
                if (ext1[j]>ext1[j+1]){
                    int temp = ext1[j];
                    ext1[j] = ext1[j+1];
                    ext1[j+1] = temp;
                }
            }
        }
        for (int ext:ext1){
            System.out.println(ext);
        }
        //二分法排序

    }
}
