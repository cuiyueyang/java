package 集合;

import Entity.Student;
import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>Description: </p>
 * <p>Date: 2021/5/31 15:36 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo5 {
    public static void main(String[] args) {
        List<Student> students = Lists.newArrayList();
        Student student1 = new Student("1","2","3",4);
        students.add(student1);
        student1.setId("2");
        students = students.stream().filter(s -> s.getId().equals("2")).collect(Collectors.toList());
        System.out.println(students.size());
        System.out.println(students.get(0).getId());
    }
}
