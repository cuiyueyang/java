package java8;

import entity.Student;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * <p>Description: </p>
 * <p>Date: 2023/09/12 13:57</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test2 {

    public static void main(String[] args) {
        ArrayList<Student> objects = new ArrayList<>();
        Student student1 = new Student("1", "1", "cuiyy",1, LocalDateTime.now());
        Student student2 = new Student("1", "1", "cuiyy",1, LocalDateTime.now().minusDays(1));
        Student student3 = new Student("1", "1", "cuiyy",1, LocalDateTime.now().minusDays(2));

        objects.add(student3);
        objects.add(student1);
        objects.add(student2);


        // 1、反转lists
        objects.sort((o1, o2) -> o2.getBirthday().compareTo(o1.getBirthday()));
        System.out.println("1");

        // 2、stream进行去重（通过id和name） 单个可以直接User::getId
        objects = objects.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Student::getId))), ArrayList::new));
//        objects = objects.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(o -> o.getId() + ";" + o.getName()))), ArrayList::new));
        System.out.println("end");
    }

}
