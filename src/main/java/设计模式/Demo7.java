package 设计模式;

/**
 * <p>Description: </p>
 * <p>Date: 2021/6/21 16:02 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */

/**
 * 代理模式：创建具有现有对象的对象，以便向外界提供接口
 * 优点：职责清晰，高扩展性，智能性
 * 缺点：由于在客户端和真是主体之间增加了代理对象，因此有些类型的代理模式可能会造成请求得处理速度变慢
 *      实现代理模式需要额外的工作，有些代理模式的实现非常复杂
 */
public class Demo7 {
    public static void main(String[] args) {
        Image image = new ProxyImage("test1");
        image.display();
        System.out.println("hello");
        image.display();
    }
}

/**
 * 创建一个接口
 */
interface Image {
    void display();
}

/**
 * 实现类1
 */
class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("displaying" + fileName);
    }
    private void loadFromDisk(String fileName) {
        System.out.println("loading" + fileName);
    }
}

/**
 * 实现类2  （代理1）
 */
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}