package test.test;

import entity.Student;
import entity.StudentVO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;

/**
 * <p>Description: </p>
 * <p>@date 2021/12/3 15:28</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test4 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Student a = new Student("003","飞羽","孟安",18, LocalDateTime.now());
        StudentVO b = new StudentVO();
        String s = JSON.toJSONString(a);
        System.out.println(s);


        BeanUtils.copyProperties(b ,a);
        System.out.println(b);

        String[] sz1 = new String[2];
        sz1[0] = "cs";
        sz1[1] = "dd";
        String str = JSON.toJSONString(sz1);
        System.out.println(str);

        String str2 = "[\"0cnk4va9etq44clq\",\"ch1b8wv3j4jvkcg6\"]";
        JSONArray su2 = JSON.parseArray(str2);
        System.out.println(su2);
    }
}
