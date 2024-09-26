package java8;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @Author: cuiyy
 * @Date: 2021/4/12 14:22
 * @Email: 13333956278@163.com
 */
public class Demo6 {
    /**
     * stream 计算求和
     * reduce：使某一特定事物在数量、程度或大小上变小或变少。
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
        Optional<Student> sum = studentStream.reduce(new BinaryOperator<Student>() {
            @Override
            public Student apply(Student student, Student student2) {
                Student student3 = new Student();
                student3.setId("007");
                student3.setAge(student.getAge() + student2.getAge());
                return student3;
            }
        });
        System.out.println(sum.get().getAge());
        System.out.println("--------------two----------");
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> reduce = integerStream.reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        });
        System.out.println(reduce.get());
    }
}
