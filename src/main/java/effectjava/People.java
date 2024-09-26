package effectjava;


/**
 * @descrition:
 * @author: cuiyy
 * @create: 2022/7/10 16:40
 **/
public class People {

    private String name;
    private String age;
    private String sex;
    private String country;

    //普通构造函数--无参
    public People() {
    }

    //普通构造函数--有参
    public People(String sex) {
        this.sex = sex;
    }

    /**
     * 1.静态工厂方法是有名称的
     * 2.静态工厂方法可以不必在每次调用他们的时候都创建一个新对象
     * @return
     */
    public static People createPeople() {
        //这里是我们可控制的，所以你可以选择new新的对象或者使用缓存的已创建的对象
        People people = new People();
        people.sex = "女";
        return people;
    }

    /**
     * 3 静态工厂方法可以返回原返回类型的任何子类型
     * @return
     */
    public static People createChildren() {
        Children people = new Children();
        return people;
    }

    /**
     * 4 静态工厂方法返回的对象的类可以随着每次调用而发生改变，这取决于所传参数值
     * @param sex
     * @return
     */
    public static People createChildrenSex(int sex) {
        if (sex == 0) {
            Children people = new Children();
            return people;
        } else {
            People people = new People();
            return people;
        }
    }

}
