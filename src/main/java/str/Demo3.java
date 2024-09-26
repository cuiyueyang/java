package str;

/**
 * <p>Description: 字符串比较是否相等</p>
 * <p>Date: 2021/6/15 09:49 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */

/**
 * 1）String类被final关键字修饰，意味着String类不能被继承，并且它的成员方法都默认为final方法；字符串一旦创建就不能再修改。
 * 2）String类实现了Serializable、CharSequence、 Comparable接口。
 * 3）String实例的值是通过字符数组实现字符串存储的。
 */

/**
 * 1.“+”连接符的效率
 * 使用“+”连接符时，JVM会隐式创建StringBuilder对象，这种方式在大部分情况下并不会造成效率的损失，不过在进行大量循环拼接字符串时则需要注意。
 * 2.字符串常量池
 * 在Java的内存分配中，总共3种常量池，分别是Class常量池、运行时常量池、字符串常量池。
 *
 */

/**
 * intern方法
 * intern 方法是一个native方法，intern方法会从字符串常量池中查询当前字符串是否存在，如果存在，就直接返回当前字符串；如果不存在就会将当前字符串放入常量池中，之后再返回
 *
 */

public class Demo3 {
    /**
     * 1）直接使用双引号声明出来的String对象会直接存储在常量池中；
     * 2）String对象的intern方法会得到字符串对象在常量池中对应的引用，如果常量池中没有对应的字符串，则该字符串将被添加到常量池中，然后返回常量池中字符串的引用；
     * 3） 字符串的+操作其本质是创建了StringBuilder对象进行append操作，然后将拼接后的StringBuilder对象用toString方法处理成String对象，这一点可以用javap -c命令获得class文件对应的JVM字节码指令就可以看出来。
     *
     * 双引号声明出来的对象会直接存在常量池中
     * new出来和拼接出来的对象会存在堆中
     * 地址存在栈中
     * intern 会从常量池中拿值，如果没有会创建一个放进去
     */
    public static void main(String[] args) {
        String s1 = "AB";
        String s2 = new String("AB");
        String s3 = "A";
        String s4 = "B";
        String s5 = "A" + "B";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
    }
}
