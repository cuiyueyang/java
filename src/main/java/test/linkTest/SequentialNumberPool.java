package test.linkTest;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class SequentialNumberPool {

    private final static int maxNumber = 10;
    private static int currentNumber = 0;
    private static int[] numbers = new int[maxNumber];
    private static final AtomicInteger currentIndex = new AtomicInteger(0);
    private static SequentialNumberPool pool = new SequentialNumberPool();
    private static LocalDate now = LocalDate.now();

    public static void init() {
        currentNumber = getCurrentNumber();
        // 初始化数字数组
        for (int i = 0; i < maxNumber; i++) {
            numbers[i] = currentNumber + 1 + i;
        }
    }

    private static int getCurrentNumber() {
        currentNumber = 10;
        return currentNumber;
    }

    public SequentialNumberPool() {
    }

    public static SequentialNumberPool getPool() {
        return pool;
    }


    /**
     * 获取下一个数字，线程安全地按顺序
     * @return
     */
    public static int getNextNumber() {
        remakeNumbers();
        int index = currentIndex.getAndIncrement();
        if (index >= maxNumber) {
            expandNumbers();
            index = currentIndex.getAndIncrement();
        }
        return numbers[index];
    }

    /**
     * 重新初始化数字池
     */
    public static void remakeNumbers() {
        //每天凌晨 numbers 重新从第一个读取
        if (!now.equals(LocalDate.now())) {
            currentNumber = 0;
            // 初始化数字数组
            for (int i = 0; i < maxNumber; i++) {
                numbers[i] = currentNumber + 1 + i;
            }
            currentIndex.set(0);
            now = LocalDate.now();
        }
    }

    /**
     * 扩容编号池
     */
    public static void expandNumbers() {
        currentNumber = numbers[maxNumber-1];
        // 初始化数字数组
        for (int i = 0; i < maxNumber; i++) {
            numbers[i] = currentNumber + 1 + i;
        }
        currentIndex.set(0);
    }

    public static void main(String[] args) {
        init();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    System.out.println(Thread.currentThread().getName() + ":" + getNextNumber());
                }
            }).start();
        }

    }

}