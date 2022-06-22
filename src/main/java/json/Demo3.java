package json;

import Entity.Student;
import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * <p>Description: Fastjson</p>
 * <p>Date: 2021/6/10 14:16 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo3 {
    private static  String strStudent = Common.strStudent;
    private static String arrStudent = Common.arrStudent;
    public static void main(String[] args) {
        //字符串转对象
        Student student = JSON.parseObject(strStudent, Student.class);
        List<Student> students = JSON.parseArray(arrStudent, Student.class);

        //对象转json字符串
        String ss1 = JSON.toJSONString(students);

    }
}
