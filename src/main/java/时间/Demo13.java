package 时间;

import java.util.Date;

/**
 * <p>Description: </p>
 * <p>Date: 2023/06/26 11:29</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo13 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed);
        Date date1 = new Date();
        Long time = date1.getTime();
        for (int i = 0; i < 100000; i++) {
        }
        Date date2 = new Date();
        Long time2 = date2.getTime();
        System.out.println(time2-time);
    }

}
