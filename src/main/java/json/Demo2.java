package json;

import Entity.Student;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;

import java.util.List;

/**
 * <p>Description: hutool 工具操作json</p>
 * <p>Date: 2021/6/10 11:17 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo2 {

    private static String strStudnet = Common.strStudent;
    private static String arrStudent = Common.arrStudent;

    public static void main(String[] args) {
        //字符串转化json
        JSONObject student1 = new JSONObject(strStudnet);
        JSONArray students = new JSONArray(arrStudent);
        //json转对象
        List<Student> lists = students.toList(Student.class);
        System.out.println(lists.size());
        Student student2 = student1.toBean(Student.class);

        //json转化字符串
        String a = student1.toString();
        String b = students.toString();
        System.out.println(a + "|" + b);

        //对象转json

    }
}
