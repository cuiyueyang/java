package collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * list练习
 * list 可重复，有序（按照存入顺序拿出）
 * Created by cuiyueyang on 2020/5/27.
 */
public class ListTest {
    public static void main(String[] args) {
        arryListTest();
        linkedListTest();
        vectorTest();

    }

    /**
     * vector
     * 1.效率低 线程安全
     * 2.有序，先进先出
     */
    private static void vectorTest() {
        Vector c = new Vector();
        c.add(1);
        c.add(3);
        c.add(2);
        c.add("");
        c.add("");
        System.out.println("--------vector---------");
        for (int i = 0; i < c.size(); i++){
            System.out.println(i + "|" + c.get(i));
        }
    }

    /**
     * linkedList
     * 1.查询慢，增删快，线程不安全
     * 有序，先进先出
     */
    private static void linkedListTest() {
        LinkedList b = new LinkedList();
        b.add(1);
        b.add(3);
        b.add(2);
        b.add("");
        b.add("");
        System.out.println("--------linkedList---------");
        for (int i = 0; i < b.size(); i++){
            System.out.println(i + "|" + b.get(i));
        }
    }

    /**
     * arrayList
     * 1.查询快，增删慢，线程不安全
     * 2.有序，先进先出
     */
    private static void arryListTest() {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add("");
        a.add("");
        System.out.println("------arrayList------");
        for (int i = 0; i < a.size(); i++){
            System.out.println(i + "|" + a.get(i));
        }
    }
}
