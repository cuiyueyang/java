package java8;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: cuiyy
 * @Date: 2021/4/12 15:24
 * @Email: 13333956278@163.com
 */
public class Demo10 {
    /**
     * stream实现分页
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
        //从第一条数据开始取1条
        studentStream.limit(1).forEach(x -> System.out.println(x.getName()));
        System.out.println("--------two---------");
        Stream<Student> studentStream1 = studentList.stream();
        //从第一条数据开始取两条
        studentStream1.skip(0).limit(2).forEach(x-> System.out.println(x.getName()));
    }
}
