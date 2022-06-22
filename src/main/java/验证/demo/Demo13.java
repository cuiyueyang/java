package 验证.demo;

/**
 * <p>Description: </p>
 * <p>@date 2022/2/10 10:19</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo13 {
}

class Car extends Vehicle
{
    public static void main (String[] args)
    {
        new  Car(). run();
    }
    private final void run()
    {
        System. out. println ("Car");
    }
}

class Vehicle
{
    private final void run()
    {
        System. out. println("Vehicle");
    }
}
