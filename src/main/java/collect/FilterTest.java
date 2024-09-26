package collect;

import entity.Student;
import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 过滤
 * <p>Description: </p>
 * <p>Date: 2021/5/31 15:36 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class FilterTest {
    public static void main(String[] args) {
        List<Student> students = Lists.newArrayList();
        Student student = new Student("1","1","1",1);
        Student student1 = new Student("2","2","3",4);
        Student student2 = new Student("3","2","3",4);
        students.add(student);
        students.add(student1);
        students.add(student2);
        students = students.stream().filter(s -> !s.getId().equals("2")).collect(Collectors.toList());
        System.out.println(students.size());
    }
}
