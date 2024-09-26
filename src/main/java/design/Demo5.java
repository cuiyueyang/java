package design;

/**
 * Created by cuiyueyang on 2020/6/9.
 */

/**
* 代理模式：为这个对象提供代理以方便对这个对象的访问
* */
public class Demo5 {
    public static void main(String[] args) {
        //学生自己交作业
        Student student = new Person("没得说");
        student.submitHomework();

        //学习委员代交作业
        Person person = new Person("有的说");
        Student student1 = new StudentProxy(person);
        student1.submitHomework();
    }
}

interface Student{
    /**
     * 交作业的方法
     */
    void submitHomework();
}

/**
 * Person实现学生类，同时也就需要重写学生的交作业方法
 */
class  Person implements Student{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void submitHomework(){
        System.out.println("交作业了");
    }
}

/**
 * 学生的代理实现学生接口
 */
class StudentProxy implements Student{
    private Person person;

    /**
     * 构造方法，将学生对象委托给代理对象
     * @param student
     */
    StudentProxy(Student student){
        if (student.getClass() == Person.class){
            //相当于学生给予了学习委员他的属性
            this.person = (Person) student;
        }
    }
    public void submitHomework(){
        person.submitHomework();
    }
}