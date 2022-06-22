package java8新特性;

import Entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: cuiyy
 * @Date: 2021/4/12 15:04
 * @Email: 13333956278@163.com
 */
public class Demo9 {
    /**
     * Stream filter 过滤
     * @param args
     */
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setId("001");
        student1.setXh("001");
        student1.setName("张三");
        student1.setAge(12);
        Student student2 = new Student();
        student2.setId("002");
        student2.setXh("002");
        student2.setName("李四");
        student2.setAge(16);
        studentList.add(student1);
        studentList.add(student2);
        Stream<Student> studentStream = studentList.stream().filter(student -> "李四".equals(student.getName()) && student.getAge() > 10);
        studentList = studentStream.collect(Collectors.toList());
        System.out.println(studentList);
    }
}
