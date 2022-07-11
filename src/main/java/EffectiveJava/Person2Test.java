package EffectiveJava;

/**
 * @descrition:
 * @author: cuiyy
 * @create: 2022/7/10 17:16
 **/
public class Person2Test {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Person2 person1 = new Person2.Builder("张三").build();
        Person2 person2 = new Person2.Builder("张三").setSex("男").build();
    }

}
