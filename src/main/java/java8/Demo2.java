package java8;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cuiyy
 * @Date: 2021/3/15 23:31
 * @Email: 13333956278@163.com
 */
public class Demo2 {
    /**
     * lambda表达式实现集合排序
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
        //降序
        studentList.sort((s1,s2) -> s1.getAge() - s2.getAge());
//        studentList.sort(Comparator.comparingInt(Student::getAge));
        studentList.forEach(s -> System.out.println(s.getName()));
    }
}
