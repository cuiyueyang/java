package java8;

import entity.Student;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cuiyy
 * @Date: 2021/4/12 15:33
 * @Email: 13333956278@163.com
 */
public class Demo11 {
    /**
     * stream实现排序 sorted
     * @param args
     */
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setId("001");
        student1.setXh("2022-03-23 13:24:15");
        student1.setName("张三");
        student1.setAge(12);
        student1.setBirthday(LocalDateTime.now().minusDays(1));
        Student student2 = new Student();
        student2.setId("002");
        student2.setXh("2021-03-23 13:24:15");
        student2.setName("李四");
        student2.setAge(16);
        student2.setBirthday(LocalDateTime.now());
        studentList.add(student1);
        studentList.add(student2);
//        Stream<Student> studentStream = studentList.stream();
//        studentStream.sorted((o1,o2) -> o1.getAge()-o2.getAge()).forEach(x -> System.out.println(x.getName()));
//        studentList.sort((x,y) -> y.getAge().compareTo(x.getAge()));
        studentList.sort((x,y) -> y.getBirthday().compareTo(x.getBirthday()));
        studentList.forEach(x ->{
            System.out.println(x.getName());
        });
    }
}
