package common.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>Description: 定长线程池</p>
 * <p>Date: 2021/8/30 10:50 </p>
 *
 * @version v1.0.0
 * @author: cuiyy
 */
public class ThreadPoolFactory {

    private static ExecutorService threadPool = Executors.newFixedThreadPool(5);

    public static synchronized ExecutorService getThreadPool() {
        if (threadPool == null) {
            threadPool = Executors.newScheduledThreadPool(5);
        }
        return  threadPool;
    }

}
