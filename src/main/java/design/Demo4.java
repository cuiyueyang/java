package design;


/**
 * Created by cuiyueyang on 2020/6/8.
 */

/**
 * 抽象工厂：创建相关或依赖对象的家族，而无需明确指定具体类
 */

/**
 * 定义接口，不同实现类
 */
public class Demo4 {
    public static void main(String[] args) {
        FruitFactory ff = new NorthFruitFactory();
        Fruit apple = ff.getApple();
        apple.get();

        Fruit banana = ff.getBanana();
        banana.get();

        System.out.println("----------");
        FruitFactory bb = new SouthFruitFactory();
        Fruit apple2 = bb.getApple();
        apple2.get();

        Fruit banana2 = bb.getBanana();
        banana2.get();

        System.out.println("--------------");
        FruitFactory cc = new InnerFruitFactory();
        Fruit apple3 = cc.getApple();
        apple3.get();
        Fruit Banana3 = cc.getBanana();
        Banana3.get();
    }
}

//定义水果接口
interface Fruit{
    public void get();
}

//定义苹果接口
abstract class Apple implements Fruit{
    public abstract void get();
}

//定义香蕉接口
abstract class Banana implements Fruit{
    public abstract void get();
}

//水谷工厂接口
interface FruitFactory{
    public Fruit getApple();
    public Fruit getBanana();
}

//实现室内苹果类
class InnerApple extends Apple{
    public void get(){
        System.out.println("长在室内的苹果");
    }
}

class InnerBanana extends Banana{
    public void get(){
        System.out.println("长在室内的香蕉");
    }
}

class InnerFruitFactory implements FruitFactory{
    public Fruit getApple(){
        return new InnerApple();
    }
    public Fruit getBanana(){
        return new InnerApple();
    }
}

class NorthApple extends Apple{
    public void get(){
        System.out.println("长在北方的苹果");
    }
}

class NorthBanana extends Banana{
    @Override
    public void get() {
        System.out.println("长在北方的香蕉");
    }
}

class NorthFruitFactory implements FruitFactory{
    public Fruit getApple(){
        return new NorthApple();
    }
    public Fruit getBanana(){
        return new NorthBanana();
    }
}

class southApple extends Apple{
    @Override
    public void get() {
        System.out.println("长在南方的苹果");
    }
}

class southBanana extends Banana{
    @Override
    public void get() {
        System.out.println("长在南方的香蕉");
    }
}

class SouthFruitFactory implements FruitFactory{

    @Override
    public Fruit getApple() {
        return new southApple();
    }

    @Override
    public Fruit getBanana() {
        return new southBanana();
    }
}




















