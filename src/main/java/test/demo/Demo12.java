package test.demo;

import org.apache.commons.compress.utils.Lists;

import java.util.List;

/**
 * <p>Description: </p>
 * <p>@date 2022/2/9 14:45</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
class Father {
    public Father() {
        System.out.println("父类无参构造方法");
    }
    static {
        System.out.println("父类静态代码块1");
    }
    private static int a = Help.fatherStaticMemberVarInit();
    static {
        System.out.println("父类静态代码块2");
    }
    {
        System.out.println("父类普通代码块1");
    }
    private int b = Help.fatherMemberVarInit();
    {
        System.out.println("父类普通代码块2");
    }
    public Father(int v) {
        System.out.println("父类带参构造方法");
    }
}

class Son extends Father {
    static {
        System.out.println("子类静态代码块1");
    }
    private static int a = Help.sonStaticMemberVarInit();
    static {
        System.out.println("子类静态代码块2");
    }
    {
        System.out.println("子类普通代码块1");
    }
    private int b = Help.sonMemberVarInit();
    {
        System.out.println("子类普通代码块2");
    }
    public Son() {
        // super(2018);
        System.out.println("子类构造方法");
    }
}

class Help {
    public static int fatherStaticMemberVarInit() {
        System.out.println("父类静态成员变量");
        return 0;
    }
    public static int fatherMemberVarInit() {
        System.out.println("父类普通成员变量");
        return 0;
    }
    public static int sonStaticMemberVarInit() {
        System.out.println("子类静态成员变量");
        return 0;
    }
    public static int sonMemberVarInit() {
        System.out.println("子类普通成员变量");
        return 0;
    }
}

public class Demo12 {
    public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println("===================");
        Son son2 = new Son();
        List<Integer> a = Lists.newArrayList();
        a.forEach((Integer x) -> {System.out.println(x);});
    }
}
