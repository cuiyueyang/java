package queue;

import java.util.ArrayDeque;
import java.util.Deque;
 
public class QueueExample {
    public static void main(String[] args) {
        // 创建一个ArrayDeque实例
        Deque<String> queue = new ArrayDeque<>();
 
        // 添加元素到队列
        queue.offer("元素1");
        queue.offer("元素2");
        queue.offer("元素3");
        queue.add("元素4");
 
        // 查看队列头部元素
        System.out.println("头部元素: " + queue.peek());
        System.out.println("头部元素: " + queue.element());

 
        // 移除并返回队列头部元素
        System.out.println("移除头部元素: " + queue.poll());
        System.out.println("移除头部元素: " + queue.remove());
 
        // 再次查看队列头部元素
        System.out.println("头部元素: " + queue.peek());
 
        // 打印队列中的所有元素
        System.out.println("队列中的元素: " + queue);

        System.out.println("队列是否为空: " + queue.isEmpty());

        System.out.println("队列长度: " + queue.size());

    }
}