package 基础概念;

/**
 * Created by cuiyueyang on 2019/4/18.
 * 构造函数
 * 1.方法名和类名相同、
 * 2.不声明返回类型
 * 3.不能被static,final,synchronized、abstract和native修饰。
 * 4.不能被子类继承
 */
public class Gouzao1 {
    int x=3;
    //无参构造函数
    public Gouzao1(){
        System.out.println(x);
    }
    //有参构造函数
    public Gouzao1(int x){
        this.x = x;
        System.out.println(x);
    }
    //不是构造函数
    public static int Gouzao1(int x){
        return x;
    }

    public static void main(String[] args) {
        Gouzao1 g1 = new Gouzao1();
        Gouzao1 g2 = new Gouzao1(1);
        System.out.println(Gouzao1(0));
    }
}
