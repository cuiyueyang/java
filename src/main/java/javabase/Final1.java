package javabase;

/**
 * <p>Description: final关键字</p>
 * <p>Date: 2021/6/15 10:17 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */

/**
 * （1）修饰变量
 *  # 用final关键字修饰的变量，只能进行一次赋值操作，并且在生存期内不可以改变它的值。final
 *  修饰的变量可以先声明，后赋值。
 *  # final修饰基本类型时，起到常量的作用，基本类型的值不可变。
 *  final修饰引用类型时，不能再指向其他的对象，但被引用的对象 的值是可以改变的（引用变量的值
 *  实际上是它所引用的对象的地址）。
 *  # 当用final作用于类的成员变量时，成员变量（局部变量只需要
 *  保证在使用之前被初始化赋值即可）必须在定义时或者构造器中进行初始化赋值。
 * （2）修饰方法
 *  final关键字修饰方法，它表示该方法不能被覆盖（重写）。
 * （3）修饰类
 *  用final修饰的类是无法被继承的。
 *
 */
public class Final1 {

    private static final String name = "cuiyy";

    public static void main(String[] args) {
        System.out.println(name);
    }

}
