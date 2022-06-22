package 多线程;

/**
 * <p>Description: 线程池</p>
 * <p>Date: 2021/6/8 11:22 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */

import common.utils.ThreadPool;
import lombok.extern.slf4j.Slf4j;

/**
 * 为什么创建线程池？
 * 1.减少线程创建及销毁所花的时间
 * 2.避免过多的线程消耗系统内存
 *
 * newFixedThreadPool： 创建一个指定线程数量的线程池，如果线程的个数超过线程池允许的最大数量，超出的线程会被存到队列中等待。
 * newCachedThreadPool： 创建一个可缓存线程池，线程的数量没有限制。如果工作线程空闲了指定时间，则该线程自动终止。
 * newScheduledThreadPool： 创建一个定长线程池，支持定时以及周期性的任务执行，类似Timer。
 * newSingleThreadExecutor： 创建一个单线程化的线程池。只创建一个线程来执行任务，并保证顺序地执行任务。如果它异常结束，也会有其他线程替代它
 *
 * 参数：
 * corePoolSize：核心线程数
 * queueCapacity：任务队列容量（阻塞队列）
 * maxPoolSize：最大线程数
 * keepAliveTime：线程空闲时间
 * allowCoreThreadTimeout：允许核心线程超时
 * rejectedExecutionHandler：任务拒绝处理器
 *
 */

@Slf4j
public class Demo13 {

    public static void sout() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        ThreadPool threadPool = ThreadPool.getThreadPool();
        threadPool.execute(() -> sout());
        threadPool.execute(() -> sout());
    }

}
