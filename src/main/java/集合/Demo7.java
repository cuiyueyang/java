package 集合;

import Entity.Student;
import com.google.common.base.Joiner;
import org.apache.commons.compress.utils.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

/**
 * <p>Description: </p>
 * <p>@date 2022/1/26 16:23</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo7 {

    public static void main(String[] args) {
        List<Student> students = Lists.newArrayList();
        Student student1 = new Student("1","2","3",4);
        students.add(student1);
        Student student2 = new Student("1","2","3",4);
        students.add(student2);
        System.out.println(students);
        Object[] a = students.toArray(new Object[0]);
        System.out.println(students.toArray(new Object[0]));

        String accounts = Joiner.on(",").join(students);
        System.out.println(accounts);

        students = students.stream().collect(
                collectingAndThen(
                        toCollection(() -> new TreeSet<>(comparing(n -> n.getId()))), ArrayList::new)
        );
        System.out.println(students);

    }

}
