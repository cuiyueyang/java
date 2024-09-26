package collect;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * map
 * 1.键值对方式存储 不允许键重复，允许值重复  不允许键为空
 * Created by cuiyueyang on 2020/5/27.
 */
public class MapTest {
    public static void main(String[] args) {
        treeMapTest();
        hashMapTest();
        hashTableTest();
        concurrentHashMapTest();
    }

    /**
     * ConcurrentHashMap
     * 1.线程安全，性能相对较差，锁住部分集合，数组+链表+红黑树实现
     */
    private static void concurrentHashMapTest() {
        ConcurrentHashMap<String,Object> map4 = new ConcurrentHashMap<>();
        map4.put("2",1);
        map4.put("1",2);
        map4.put("3",3);
        System.out.println("----------ConcurrentHashMap---------");
        for (String str4:map4.keySet()){
            System.out.println(map4.get(str4));
        }
    }

    /**
     * Hashtable
     * 1.线程安全，但是相对的性能比较慢，把整个集合锁住
     */
    private static void hashTableTest() {
        Hashtable<String,Object> map3 = new Hashtable<>();
        map3.put("cs1",4);
        map3.put("1",1);
        map3.put("2",3);
        map3.put("3",2);
        map3.put("cs2",5);
        System.out.println("----------Hashtable---------");
        for(String str3:map3.keySet()){
            System.out.println(map3.get(str3));
        }
    }

    /**
     * HashMap
     * 1.线程不安全，访问较快
     * 数组+链表+红黑树
     * 在存入的时候根据 hashcode 找到存入的位置，如果hashcode相同则在同一个位置用链表的形式进行存入
     * 根据equals(key) 判断是否进行覆盖，如果链表的长度大于8则将结构转换为红黑树，当红黑树长度小于6转化为链表
     */
    private static void hashMapTest() {
        HashMap<String,Object> map2 = new HashMap<>();
        map2.put("1",1);
        map2.put("3",3);
        map2.put("2",2);
        map2.put("4",2);
        System.out.println("----------HashMap---------");
        for (Object obj1:map2.values()){
            System.out.println(obj1);
        }
    }

    /**
     * TreeMap
     * 1.能够把保存的（key）记录按照默认升序的方式获取
     * 2.线程不安全
     */
    private static void treeMapTest() {
        TreeMap<String,Object> map1 = new TreeMap();
        map1.put("cs2",0);
        map1.put("2",1);
        map1.put("1",2);
        map1.put("3",3);
        map1.put("cs1", 4);
        System.out.println("---------TreeMap----------");
        for(String str1:map1.keySet()){
            System.out.println(map1.get(str1));
        }
    }
}
