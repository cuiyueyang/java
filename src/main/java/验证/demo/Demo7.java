package 验证.demo;

/**
 * <p>Description: </p>
 * <p>Date: 2021/6/23 10:28 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */

/**
 * 验证继承和多态
 */

public class Demo7 {
    public static void main(String[] args) {
        A a = new B();
        a.AA();
        C c = new D();
        c.CC();
        F f = new F ();
        f.E();
    }
}

class A {
    public void AA() {
        System.out.println("A");
    }
}

class B extends A {
    public void AA() {
        System.out.println("B");
    }
}

interface C {
    void CC();
}

class D implements C {
    @Override
    public void CC() {
        System.out.println("D");
    }
}

abstract class E {
    void E() {
        System.out.println("E");
    }
}

class F extends E {
}