package 集合;

import Entity.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: cuiyy
 * @Date: 2021/4/11 10:40
 * @Email: 13333956278@163.com
 */
public class Demo4 {
    /**
     * set 集合去重对象，重写 equals方法
     * @param args
     */
    public static void main(String[] args) {
        Set<Student> set = new HashSet();
        Student student = new Student();
        Student student1 = new Student();
        student.setId("1");
        student.setName("1");
        student1.setId("1");
        student1.setName("1");
        //set去重对象比较的是生成的一个地址，不是直接比较的值，如果要用set去重对象，要重写equals方法(在bean中重写)
        set.add(student);
        set.add(student1);
        set.add(student);
        set.forEach(x -> {
            System.out.println(x.getId());
            System.out.println(x.getName());
        });
        System.out.println("-------第二部分---------");
        Set<String> set2 = new HashSet();
        String a = "bbb";
        String b = "bbb";
        set2.add(a);
        set2.add(a);
        set2.add(b);
        //set去重单对象可以去重
        for (String s : set2) {
            System.out.println(s);
        }
    }


}
