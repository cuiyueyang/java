package javabase;


import entity.MyLinkedList;

/**
 * <p>Description: 链表</p>
 * <p>@date 2022/6/27 10:51</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Linked {

    public void test1() {
        MyLinkedList list = new MyLinkedList();
        list.add(0);
        list.add(1);
        list.display();
    }

    public static void main(String[] args) {
        Linked linked = new Linked();
        linked.test1();
    }

}
