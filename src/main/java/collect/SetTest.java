package collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * set练习
 * 1.set中的元素不能重复
 * 2.set是无序的（无序指的是和添加顺序不一样）
 * Created by cuiyueyang on 2020/5/27.
 */
public class SetTest {
    public static void main(String[] args) {
        hashSetTest();
        treeSetTest();
        linkedHashSetTest();
    }

    /**
     * LinkedHashSet
     * 1.线程不安全
     * 2.有序
     */
    private static void linkedHashSetTest() {
        LinkedHashSet<String> set3 = new LinkedHashSet();
        set3.add("1");
        set3.add("3");
        set3.add("2");
        set3.add("");
        set3.add("");
        System.out.println("---------LinkedHashSet----------");
        for (String str3:set3){
            System.out.println("x"+"|"+str3);
        }
    }

    /**
     * TreeSet
     * 1.线程不安全
     * 2.无序
     */
    private static void treeSetTest() {
        TreeSet<String> set2 = new TreeSet();
        set2.add("1");
        set2.add("3");
        set2.add("2");
        set2.add("");
        set2.add("");
        System.out.println("---------TreeSet----------");
        for (String str2:set2){
            System.out.println("x"+"|"+str2);
        }
    }

    /**
     * Hashset
     * 1.线程不安全
     * 2.无序
     */
    private static void hashSetTest() {
        Set<String> set1 = new HashSet<>();
        set1.add("2");
        set1.add("1");
        set1.add("3");
        set1.add("");
        set1.add("");
        set1.add("1");
        System.out.println("----------HashSet----------");
        for (String str1:set1){
            System.out.println("x"+"|"+str1);
        }
    }
}
