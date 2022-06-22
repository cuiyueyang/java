package 集合;

import Entity.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Description: 集合效率测试</p>
 * <p>@date 2021/11/5 16:02</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test1 {
    public static void main(String[] args) {
        Map<String, Student> maps = new HashMap<>();
        for (int i = 0; i < 100000; i++) {
            Student student = new Student();
            student.setId(String.valueOf(i));
            maps.put(String.valueOf(i), student);
        }
        System.out.println(maps.get("987").getId());
    }
}
