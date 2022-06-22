package 集合;

import Entity.Student;
import com.alibaba.fastjson.JSON;
import json.Common;
import org.apache.commons.compress.utils.Lists;

import java.util.List;

/**
 * <p>Description: ArrayList 晋级1</p>
 * <p>Date: 2021/6/11 15:39 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */

/**
 * ArrayList实现了List, RandomAccess, Cloneable, java.io.Serializable等接口
 * ArrayList实现了List，提供了基础的添加、删除、遍历等操作
 * ArrayList实现了RandomAccess，提供了随机访问的能力
 * ArrayList实现了Cloneable，可以被克隆
 * ArrayList实现了Serializable，可以被序列化
 */

/**
 * ArrayList实现了RandomAccess,但是只是一个空的接口，起到标识的作用
 * ArrayList for循环更快， LinkedList 迭代更快
 * 程序在循环的时候可以通过判断，是否实现RandomAccess接口来判断使用哪种方式进行遍历
 * 实现RandomAccess接口的List可以通过for循环来遍历数据比使用iterator遍历数据更高效，未实现RandomAccess接口的List可以通过iterator遍历数据比使用for循环来遍历数据更高效。
 */

/**
 * ArrayList集合默认长度是多少？
 * 默认长度为10。但是ArrayList的默认长度是有jdk版本差异的，在jdk8版本之前默认长度是10。而在jdk8版本的时候对ArrayList数组的默认长度进行了优化，将原来的默认长度10，改为了初始长度为0。当我们在首次添加元素，需要分配数组空间时，jdk自动帮我们进行了扩容操作，将初始数组长度扩容成了10。这样做有效地降低了无用内存的占用！它利用了数组扩容的特性来完成集合的这些功能，这也就是ArrayList集合查询快、增删慢的原因了！
 */

/**
 * add主要的执行逻辑如下:
 * 1）确保数组已使用长度（size）加1之后足够存下 下一个数据
 * 2）修改次数modCount 标识自增1，如果当前数组已使用长度（size）加1后的大于当前的数组长度，则调用grow方法，增长数组，grow方法会将当前数组的长度变为原来容量的1.5倍。
 * 3）确保新增的数据在地方存储之后，则将新元素添加到位于size的位置上。
 * 4）返回添加成功布尔值。
 */

public class Demo6 {
    public static void main(String[] args) {
        String str = Common.arrStudent;
        List<Student> students = JSON.parseArray(str, Student.class);
        List<Student> students1 = Lists.newArrayList();
        //将一个集合添加到另一个集合
        students1.addAll(students);
        students1.addAll(students);
        Student student = new Student("003","飞羽","孟安",18);
        students1.add(student);
        //求交集
        students1.retainAll(students);
        if (students1.size() > 0) {
            System.out.println("有交集");
        } else {
            System.out.println("没有交集");
        }

        //测试比较的是地址还是值，还是id值
        Student student1 = new Student("001","飞羽","孟安",17);
        Student student2 = new Student("003","飞羽","孟安",18);
        List<Student> list1 = Lists.newArrayList();
        List<Student> list2 = Lists.newArrayList();
        list1.add(student);
        list2.add(student);
        list1.add(student1);
        list1.add(student2);
        list1.retainAll(list2);

        System.out.println("---------------");
        list1.remove(0);
        list1.get(0);


    }
}
