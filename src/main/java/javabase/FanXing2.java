package javabase;

import entity.Student;
import common.annotation.PropertiesName;

import java.lang.reflect.Field;

/**
 * <p>Description: 自定义注解测试</p>
 * <p>Date: 2021/6/2 11:02 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class FanXing2 {
    public static void main(String[] args) {
        Student student = new Student("1","2","3",3);
        student.setZjyCs("你好");
        Field[] fields = Student.class.getDeclaredFields();
        for (Field field : fields) {
            PropertiesName properties = field.getAnnotation(PropertiesName.class);
            if (null != properties) {
                System.out.println(properties.name());
            }
        }
    }

}
