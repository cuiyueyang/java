package 验证.demo;

import Entity.Student;

/**
 * @Author: cuiyy
 * @Date: 2021/4/11 11:32
 * @Email: 13333956278@163.com
 */

/**
 * equals 和 ==
 */
public class Demo1 {
    public static void main(String[] args) {
        String a = "bbb";
        String b = "bbb";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println("---------------第二部分----------------------");
        Student student = new Student();
        student.setId("1");
        Student student1 = new Student();
        student1.setId("1");
        System.out.println(student == student1);
        System.out.println(student.equals(student1));
    }
}
