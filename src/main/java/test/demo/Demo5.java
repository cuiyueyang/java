package test.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </p>
 * <p>Date: 2021/6/11 15:33 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo5 {
    public static void main(String[] args) {
        //new 出来的是一个空数组
        List list1 = new ArrayList();
        System.out.println(list1);

        List list2 = null;
        System.out.println(list2);

        List list3 = new ArrayList(0);
        System.out.println(list3);

    }
}
