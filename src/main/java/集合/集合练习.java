package 集合;

import java.util.*;

/**
 * Created by cuiyueyang on 2020/4/23.
 */
public class 集合练习 {

    public static void random10(){
        Random random = new Random();
        HashSet<Integer> hs = new HashSet<>();
        while (hs.size()<10){
            hs.add(random.nextInt(20));
        }
        for (Integer integer:hs){
            System.out.println(integer);
        }
        System.out.println(hs.size());
    }

    //从键盘输入一行字符，要求去除字符
    public static void scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符：");
        String line = scanner.nextLine();
        char[] c = line.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        for (int i=0;i<c.length;i++){
            hs.add(c[i]);
        }
        for (Character character:hs){
            System.out.println(character);
        }
    }

    //list遍历
    public static void arraylist(){
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(11);
        integerList.add(111);
        integerList.add(1111);
        integerList.add(11111);
        Iterator<Integer> it = integerList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (int i=0;i< integerList.size();i++){
            System.out.println(integerList.get(i));
        }
        for (Integer i:integerList){
            System.out.println(i);
        }
    }

    public static void str(){
        String str = "abc";
        System.out.println("源字符串"+str);
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();
        Set<Character> set3 = new HashSet<Character>();
    }
    public static void main(String[] args) {
        //random10();
        //scan();
        arraylist();
    }
}
