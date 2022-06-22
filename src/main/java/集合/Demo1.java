package 集合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by cuiyueyang on 2020/5/27.
 */
public class Demo1 {
    //list练习
    //list 可重复，有序（按照存入顺序拿出）
    public static void main(String[] args) {
        //arryList
        //1.查询快，增删慢，线程不安全
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add("");
        a.add("");
        for (int i=0;i<a.size();i++){
            System.out.println(i+"|"+a.get(i));
        }
        System.out.println("---------------------------");
        //linkedList
        //1.查询慢，增删快，线程不安全
        LinkedList b = new LinkedList();
        b.add(1);
        b.add(3);
        b.add(2);
        b.add("");
        b.add("");
        for (int i=0;i<b.size();i++){
            System.out.println(i+"|"+b.get(i));
        }
        System.out.println("-----------------");
        //Vector 数组实现
        //1.效率低线程安全
        Vector c = new Vector();
        c.add(1);
        c.add(3);
        c.add(2);
        c.add("");
        c.add("");
        for (int i=0;i<c.size();i++){
            System.out.println(i+"|"+c.get(i));
        }
    }
}
