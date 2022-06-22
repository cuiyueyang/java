package 设计模式;

/**
 * Created by cuiyueyang on 2020/6/2.
 */
public class Demo1 {
    /**
     *  单例设计模式：某类1.只能有一个实例，2.自我实例化，3.提供全局访问的点
     *  优点：节约系统资源，提高系统效率，能够严格控制客户对它的访问
     *  缺点：系统中只有一个实例，导致单例类职责过重，违背了“单一职责原则”，没有抽象类扩展起来比较困难
     */
    public static void main(String[] args) {

    }
}

/**
 * 饿汉式单例模式(在类加载的时候创建一个实例)1.线程安全
 */
class HuangerySingleInstance{
    /**在类加载时生成一个实例*/
    private final static HuangerySingleInstance instance = new HuangerySingleInstance();
    /**
     * 因为类默认会有一个公有的无参构造函数，所以用私有的进行覆盖
     */
    private HuangerySingleInstance(){}
    public static HuangerySingleInstance getInstance(){
        return instance;
    }
}


/**
 * 懒汉单例模式（第一次调用的时候才创建）线程不安全
 */
class LazySingleInstance{
    private static LazySingleInstance instance = null;
    private LazySingleInstance(){}
    public static  LazySingleInstance getInstance(){
        if (null == instance){
            synchronized (LazySingleInstance.class){
                if (null == instance){
                    instance = new LazySingleInstance();
                }
            }
        }
        return instance;
    }
}


