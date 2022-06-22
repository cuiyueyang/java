package 小工具测试;

import Entity.Student;
import cn.hutool.core.collection.ListUtil;
import org.apache.commons.compress.utils.Lists;

import java.util.List;

/**
 * <p>Description: </p>
 * <p>@date 2022/2/8 13:37</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class ListUtilsTest {

    public static void main(String[] args) {
        Student student1 = new Student("001","飞羽","孟安",17);
        Student student2 = new Student("002","飞羽","孟安",18);
        Student student3 = new Student("003","飞羽","孟安",19);
        Student student4 = new Student("004","飞羽","孟安",20);
        Student student5 = new Student("005","飞羽","孟安",21);
        List<Student> list1 = Lists.newArrayList();
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list1.add(student4);
        list1.add(student5);
        List<List<Student>> pageList = ListUtil.split(list1, 2);
        pageList.forEach(x -> System.out.println(x));
    }

}
