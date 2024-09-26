package entity;

/**
 * <p>Description: </p>
 * <p>@date 2022/6/27 14:15</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Node {
    public int data;
    public Node next;

    public Node() {}

    public Node(int value) {
        this.data = value;
    }
}
