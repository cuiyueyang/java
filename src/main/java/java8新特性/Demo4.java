package java8新特性;

import Entity.Student;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: cuiyy
 * @Date: 2021/4/11 10:33
 * @Email: 13333956278@163.com
 */
public class Demo4 {
    /**
     * stream 将list 集合转化为 set
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
        Student student = new Student();
        student.setId("1");
        student.setName("1");
        Student student2 = new Student();
        student2.setId("1");
        student2.setName("1");
        list.add(student);
        list.add(student);
        list.add(student2);
        list.forEach(x -> {
            System.out.println(x.getId());
        });
        System.out.println("--------------第二部分---------");
        /**
         * 创建stream两种方式
         * 1.串行流stream()  单线程
         * 2.并行流paralelStream() 多线程
         * 并行流 比串行流效率要高
         */
//        list.stream();
//        list.parallelStream();
        Stream<Student> stream = list.stream();
        //转换成set集合 (这里set集合本来是不能去重对象的，bean中重写了equals 方法)
        Set<Student> studentSet = stream.collect(Collectors.toSet());
        studentSet.forEach(x -> {System.out.println(x.getId());});
    }
}
