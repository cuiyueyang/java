package java8新特性;

import Entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Author: cuiyy
 * @Date: 2021/4/12 14:57
 * @Email: 13333956278@163.com
 */
public class Demo8 {
    /**
     * Stream.Match 用法
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
        Stream<Student> studentStream = studentList.stream();
        //anyMath 任意一条  allMath 全部
        boolean b = studentStream.anyMatch(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return "cuiyy".equals(student.getName());
            }
        });
        System.out.println(b);
    }
}
