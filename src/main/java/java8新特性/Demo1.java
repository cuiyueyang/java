package java8新特性;

import Entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cuiyy
 * @Date: 2021/3/15 23:24
 * @Email: 13333956278@163.com
 */
public class Demo1 {
    /**
     * lambda 实现集合遍历
     * @param args
     */
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setId("001");
        student1.setXh("001");
        student1.setName("张三");
        Student student2 = new Student();
        student2.setId("002");
        student2.setXh("002");
        student2.setName("张三");
        studentList.add(student1);
        studentList.add(student2);
        studentList.forEach(s -> {
            if ("001".equals(s.getId())) {
                s.setName("李四");
            }
        });
        studentList.forEach(s -> {
            System.out.println(s.getName());
        });
        studentList.forEach(s-> System.out.println(s.getName()));
    }
}
