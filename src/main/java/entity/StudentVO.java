package entity;

import common.annotation.PropertiesName;
import lombok.Data;

/**
 * @Author: cuiyy
 * @Date: 2021/3/15 23:23
 * @Email: 13333956278@163.com
 */
@Data
public class StudentVO {
    /**id*/
    private String id;
    /**学号*/
    private String xh;
    /**姓名*/
    private String name;
    /**年龄*/
    private int age;
    /**生日*/
    private String birthday;

    /**自定义注解测试*/
    @PropertiesName(name = "自定义注解测试")
    private String zjyCs;

    public StudentVO(String id, String xh, String name, int age) {
        this.id = id;
        this.xh = xh;
        this.name = name;
        this.age = age;
    }

    public StudentVO(String id, String xh, String name, int age, String birthday) {
        this.id = id;
        this.xh = xh;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public StudentVO() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", xh='" + xh + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StudentVO) {
            StudentVO student = (StudentVO) obj;
            return (this.getId().equals(student.getId()));
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }

}
