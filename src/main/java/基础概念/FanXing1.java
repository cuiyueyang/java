package 基础概念;

import Entity.Student;
import common.utils.FanXingUtils;
import org.apache.commons.compress.utils.Lists;

import java.util.List;

/**
 * <p>Description: 泛型测试</p>
 * <p>Date: 2021/6/2 09:48 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class FanXing1 {
    public static void main(String[] args) {
        List<String> list1 = Lists.newArrayList();
        list1.add("1");
        System.out.println(FanXingUtils.length(list1));
        List<Student> list2 = Lists.newArrayList();
        list2.add(new Student("1","2","3",1));
        list2.set(0,new Student("9","3","44",2));
        System.out.println(FanXingUtils.length(list2));
        list2.add(0,new Student("10","12","13",4));
        System.out.println(FanXingUtils.length(list2));
        list2.stream().forEach(s-> System.out.println(s.getId()));
    }
}
