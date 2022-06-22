package java8新特性;

import Entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Author: cuiyy
 * @Date: 2021/4/12 14:37
 * @Email: 13333956278@163.com
 */
public class Demo7 {
    /**
     * Stream 取最大最小值
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
        Optional<Student> max = studentStream.max(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() -o2.getAge();
            }
        });
        //在 java8 中，Stream 不能被重用，一旦它被使用或使用，流将被关闭
        Stream<Student> studentStream1 = studentList.stream();
        Optional<Student> min = studentStream1.min((o1, o2) -> o1.getAge() -o2.getAge());
        System.out.println(max.get().getAge());
        System.out.println(min.get().getAge());


    }
}
