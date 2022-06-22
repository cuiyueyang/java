package java8新特性;

import Entity.Student;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: cuiyy
 * @Date: 2021/4/11 11:44
 * @Email: 13333956278@163.com
 */
public class Demo5 {
    /**
     * stream 将list集合转化为map (list 没有key)
     * * @param args
     */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
        Student student = new Student();
        student.setId("1");
        student.setName("1");
        Student student2 = new Student();
        student2.setId("2");
        student2.setName("2");
        list.add(student);
        list.add(student2);
        list.forEach(x -> {
            System.out.println(x.getId());
        });
        System.out.println("--------------第二部分---------");
        Stream<Student> studentStream = list.stream();
        Map<String,Student> studentMap = studentStream.collect(Collectors.toMap(x -> x.getId(), x -> x));
        studentMap.forEach((x,x1) -> System.out.println(x+"--"+x1) );
    }
}
