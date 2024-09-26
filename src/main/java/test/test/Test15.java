package test.test;

import entity.Student;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.compress.utils.Lists;

import java.util.List;

/**
 * <p>Description: </p>
 * <p>@date 2022/3/25 10:01</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test15 {
    public static void main(String[] args) {
        Student student = new Student();
        classTest(student);
        System.out.println(student);
        Student.HazardBillDTO hazardBillDTO = null;
        setValue(student.getHazardBillDTOS().get(0), hazardBillDTO);
        System.out.println(hazardBillDTO);

    }

    private static void setValue(Student.HazardBillDTO hazardBillDTO, Student.HazardBillDTO hazardBillDTO1) {
        System.out.println(hazardBillDTO.getCs());
        hazardBillDTO1 = new Student.HazardBillDTO();
        hazardBillDTO.setCs("22");
    }

    private static void classTest(Student student) {
        student.setId("001");
        List<Student.HazardBillDTO> hazardBillDTOS = Lists.newArrayList();

        if (CollectionUtils.isNotEmpty(hazardBillDTOS)) {
            System.out.println("dd");
        }

        Student.HazardBillDTO hazardBillDTO = new Student.HazardBillDTO();
        hazardBillDTO.setCs("cs");
        hazardBillDTOS.add(hazardBillDTO);
        student.setHazardBillDTOS(hazardBillDTOS);
    }
}
