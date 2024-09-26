package test.test;

/**
 * <p>Description: </p>
 * <p>@date 2022/2/17 15:36</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/

public class Test13 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.methodOne();
    }
}

class Base
{
    public void methodOne()
    {
        System.out.print("A");
        methodTwo();
    }

    public void methodTwo()
    {
        System.out.print("B");
    }
}

class Derived extends Base
{
    public void methodOne()
    {
        super.methodOne();
        System.out.print("C");
    }

    public void methodTwo()
    {
        super.methodTwo();
        System.out.print("D");
    }
}

