package design;

/**
 * <p>Description: </p>
 * <p>Date: 2021/6/21 15:02 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */

import org.apache.commons.compress.utils.Lists;

import java.util.List;

/**
 * 观察者模式：适用于  1对多对象关系，当一对象发生改变时通知多个对象
 * 观察者模式使用三个类 subject,observer,client
 */
public class Demo6 {
    public static void main(String[] args) {
        /**
         * 其实就是添加到list里面的对象，进行统一的修改，如果不使用观察者模式
         * 不仅仅是这样，具体的方法因为实现类的重写，根据对象的不同也进行了不同的处理
         * 想要达到这种效果，就要按照这种模式进行编写，观察者模式
         */
        Subject subject = new Subject();
        A_Observer aObserver = new A_Observer();
        B_Observer bObserver = new B_Observer();
        C_Observer cObserver = new C_Observer();
        subject.addAttach(aObserver);
        subject.addAttach(bObserver);
        subject.addAttach(cObserver);
        subject.setMsg("hello");
    }
}

/**
 * 观察者接口
 */
abstract class Observer {
    public abstract void update(String msg);
}

/**
 * 第一个观察者（实现类）
 */
class A_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(A_Observer.class.getName() + ":" + msg);
    }
}

/**
 * 第二个观察者
 */
class B_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(B_Observer.class.getName() + ":" + msg);
    }
}

/**
 * 第三个观察者
 */
class C_Observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println(C_Observer.class.getName() + ":" + msg);
    }
}

/**
 * 被观察者
 */
class Subject {
    private List<Observer> observers = Lists.newArrayList();
    public void setMsg(String msg) {
        notifyAll(msg);
    }
    /**
     * 订阅
     */
    public void addAttach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知所有订阅的观察者
     * @param msg
     */
    private void notifyAll(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}