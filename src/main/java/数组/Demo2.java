package 数组;

import java.util.Arrays;
import java.util.List;

/**
 * <p>Description: </p>
 * <p>@date 2022/6/28 14:25</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo2 {
    public static void main(String[] args) {
        Integer[] ext1 = {1,2,5,4,3};
        //数组转列表
        List<Integer> list = Arrays.asList(ext1);
        //降序排序
        list.sort((s1,s2) -> s1 - s2);
        //列表转数组
        Integer[] ext2 = (Integer[]) list.toArray();
        System.out.println(ext2);
        System.out.println(4/2);
    }
}
