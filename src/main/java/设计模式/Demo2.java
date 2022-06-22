package 设计模式;

/**
 * Created by cuiyueyang on 2020/6/5.
 */

/**
* 工厂方法模式:抽象工厂模式的孪生兄弟，工厂方法模式定义了一个创建对象的接口，
* 由子类决定要实例化的类是哪一个，也就是说工厂方法模式让实例化推迟到子类。
* 分为简单工厂模式，工厂方法模式，抽象工厂模式
* */
/**
 * 单工厂模式：一个工厂类根据传入的参量决定创建处哪一种类型的产品类实例
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("1".equals(1));
        System.out.println(1==1);
        SendFactory sendFactory = new SendFactory();
        sendFactory.produce(1).send();
        sendFactory.produce(2).send();
    }
}

/**
 * 定义一个发送邮件的接口
 */
interface Send{
    void send();
}

/**
 * 实现类1
 */
class Mail implements Send{
    public void send(){
        System.out.println("this is a Mail message!");
    }
}

/**
 * 实现类2
 */
class Sms implements Send{
    public void send(){
        System.out.println("this is a sms message!");
    }
}

/**
 * 定义发送工厂
 */
class SendFactory{
    public Send produce(int type){
        if(1==type){
            return  new Mail();
        }else {
            return new Sms();
        }
    }
}
