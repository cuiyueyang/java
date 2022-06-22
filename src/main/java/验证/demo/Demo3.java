package 验证.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: 验证list index</p>
 * <p>Date: 2021/5/27 09:27 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo3 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("a");
        stringList.add(0,"b");
        stringList.add(0,"c");
        stringList.add("d");
        //从结果来看是默认放到末尾，index可以控制放到开头
        stringList.stream().forEach(s -> System.out.println(s));
        System.out.println(stringList.get(-1));
    }
}

