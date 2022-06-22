package 集合;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by cuiyueyang on 2020/5/27.
 */
public class Demo2 {
    //set练习
    //1.set中的元素不能重复
    //2.set是无序的（无序指的是和添加顺序不一样）
    public static void main(String[] args) {
        //Hashset
        //1.线程不安全
        Set<String> set1 = new HashSet<>();
        set1.add("2");
        set1.add("1");
        set1.add("3");
        set1.add("");
        set1.add("");
        set1.add("1");
        for (String str1:set1){
            System.out.println("x"+"|"+str1);
        }
        System.out.println("------------------------");
        //TreeSet
        //1.线程不安全
        TreeSet<String> set2 = new TreeSet();
        set2.add("1");
        set2.add("3");
        set2.add("2");
        set2.add("");
        set2.add("");
        for (String str2:set2){
            System.out.println("x"+"|"+str2);
        }
        System.out.println("------------------------");
        //LindedHashSet
        //1.线程不安全
        LinkedHashSet<String> set3 = new LinkedHashSet();
        set3.add("1");
        set3.add("3");
        set3.add("2");
        set3.add("");
        set3.add("");
        for (String str3:set3){
            System.out.println("x"+"|"+str3);
        }
    }
}
