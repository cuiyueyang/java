package collect;

import entity.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * set 集合去重对象，重写 equals方法
 * @Author: cuiyy
 * @Date: 2021/4/11 10:40
 * @Email: 13333956278@163.com
 */
public class Set2Test {

    public static void main(String[] args) {
        strTest();
        objectTest();
    }

    private static void strTest() {
        System.out.println("----------字符串去重---------");
        Set<String> set2 = new HashSet();
        String a = "aaa";
        String b = "bbb";
        set2.add(a);
        set2.add(b);
        set2.add(a);
        //set去重单对象可以去重
        for (String s : set2) {
            System.out.println(s);
        }
    }

    private static void objectTest() {
        System.out.println("----------对象去重---------");
        Set<Student> set = new HashSet();
        Student student = new Student("1", "1", "1", 1);
        Student student1 = new Student("2", "2", "2", 2);
        //set去重对象比较的是生成的一个地址，不是直接比较的值，如果要用set去重对象，要重写equals方法(在bean中重写)
        set.add(student);
        set.add(student1);
        set.add(student);
        set.forEach(x -> {
            System.out.println(x.getId());
        });
    }


}
