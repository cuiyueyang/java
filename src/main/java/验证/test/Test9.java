package 验证.test;

import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.TreeSet;

/**
 * <p>Description: </p>
 * <p>@date 2022/2/8 15:49</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test9 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        TreeSet<Integer> subSet = new TreeSet<Integer>();
        for(int i=606;i<613;i++){
            if(i%2==0){
                set.add(i);
            }
        }
        // set.subSet 返回边界值 >= <=
        subSet = (TreeSet)set.subSet(608,true,611,true);
        set.add(609);
        System.out.println(set+" "+subSet);


        List<Integer> list = Lists.newArrayList();
        list.add(0);
        list.add(1);
        List<Integer> list2 = Lists.newArrayList();
        list2.add(list.get(1));
        list.set(1, 2);
        System.out.println(list+""+list2);


    }
}
