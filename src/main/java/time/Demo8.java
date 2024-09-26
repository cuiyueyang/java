package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * <p>Description: 计算两个时间相差多少天</p>
 * <p>@date 2022/3/8 16:53</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo8 {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

    public static void main(String[] args) {
        String startTime = "2020-05-26 00:00:00";
        LocalDateTime startDateTime = LocalDate.parse(startTime,formatter).atStartOfDay();
        System.out.println(startDateTime);
        String endTime = "2020-05-26 07:00:00";
        LocalDateTime endDateTime = LocalDate.parse(endTime,formatter).plusDays(1L).atStartOfDay();
        System.out.println(startDateTime.until(endDateTime, ChronoUnit.DAYS));
        System.out.println(endDateTime.until(startDateTime, ChronoUnit.DAYS));

        LocalDate now = LocalDate.now();
    }
}
