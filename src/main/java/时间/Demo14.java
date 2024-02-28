package 时间;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>Description: 只比较时分秒</p>
 * <p>Date: 2024/02/28 16:22</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo14 {
    public static void main(String[] args) {
        String time1 = "17:15:30";
        String time2 = "12:30:45";
        LocalTime localTime1 = LocalTime.parse(time1);
//        LocalTime localTime2 = LocalTime.parse(time2);
        LocalTime localTime2 = LocalDateTime.now().toLocalTime();
        int result = localTime1.compareTo(localTime2);
        if (result < 0) {
            System.out.println("earlier");
        } else if (result > 0) {
            System.out.println("later");
        } else {
            System.out.println("equal");
        }
    }
}
