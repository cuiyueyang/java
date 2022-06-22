package 基础概念;

/**
 * Created by cuiyueyang on 2019/4/18.
 * 当通过new语句创建一个对象时，在不同的条件下，对象可能会有不同的初始化行为。
 * 例如对于公司新进来的一个雇员，在一开始的时候，
 * (1)有可能他的姓名和年龄是未知的，
 * (2)也有可能仅仅他的姓名是已知的，也有可能姓名和年龄都是已知的。
 * 如果姓名是未知的，就暂且把姓名设为"无名氏"，
 * 如果年龄是未知的，就暂且把年龄设为-1。
 *可通过重载构造方法来表达对象的多种初始化行为。
 *以下例程的Employee类的构造方法有三种重载形式。在一个类的多个构造方法中，
 *可能会出现一些重复操作。为了提高代码的可重用性，Java语言允许在一个构造
 *方法中，用this语句来调用另一个构造方法
 */
public class Gouzao3 {
    private String name;
    private int age;
    //当雇员的姓名和年龄都已知，调用此方法
    public Gouzao3(String name,int age){
        this.name = name;
        this.age = age;
    }
    //当雇员的姓名已知，年龄未知
    public Gouzao3(String name){
        this.name = name;
    }
    //当雇员的姓名未知，年龄已知
    public Gouzao3(int age){
        this.age = age;
    }
    //当姓名年龄都未知时
    public Gouzao3(){
        this("无名氏");
    }

}
