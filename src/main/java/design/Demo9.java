package design;

/**
 * <p>Description: </p>
 * <p>Date: 2021/6/22 10:10 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */

/**
 * 原型模式：创建重复的对象，同时又能保证性能。
 */
public class Demo9 {
}

abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
