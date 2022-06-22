package Entity;

import common.annotation.PropertiesName;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: cuiyy
 * @Date: 2021/3/15 23:23
 * @Email: 13333956278@163.com
 */
@Data
public class Student {
    /**id*/
    private String id;
    /**学号*/
    private String xh;
    /**姓名*/
    private String name;
    /**年龄*/
    private int age;
    /**生日*/
    private LocalDateTime birthday;
    private List<HazardBillDTO> hazardBillDTOS;

    @Data
    public static class HazardBillDTO {
        private String cs;

        @Override
        public String toString() {
            return "HazardBillDTO{" +
                    "cs='" + cs + '\'' +
                    '}';
        }
    }

    /**自定义注解测试*/
    @PropertiesName(name = "自定义注解测试")
    private String zjyCs;

    public Student(String id, String xh, String name, int age) {
        this.id = id;
        this.xh = xh;
        this.name = name;
        this.age = age;
    }

    public Student(String id, String xh, String name, int age, LocalDateTime birthday) {
        this.id = id;
        this.xh = xh;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", xh='" + xh + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", hazardBillDTOS=" + hazardBillDTOS +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return (this.getId().equals(student.getId()));
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }

}
