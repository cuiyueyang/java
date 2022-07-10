package common.utils;

/**
 * <p>Description: </p>
 * <p>@date 2022/6/27 14:24</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class MyLinkedList {
    private Node first = null;
    private Node current = null;

    public void add(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            current = newNode;
        } else {
            current.next = newNode;
            current = newNode;
        }
    }

    public void display() {
        Node node = first;
        while (node != null) {
            int value = node.data;
            System.out.println(value);
            node = node.next;
        }
    }

}
