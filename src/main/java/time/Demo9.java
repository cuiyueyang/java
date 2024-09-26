package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>Description: 获取当月开始时间，结束时间</p>
 * <p>@date 2022/5/19 10:38</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo9 {
    public static void main(String[] args) {
        Calendar a = Calendar.getInstance();
        a.set(Calendar.DATE, 1);//把日期设置为当月第一天
        a.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天
        //当月有多少天
        int maxDate = a.get(Calendar.DATE);

        SimpleDateFormat sdfTwo = new SimpleDateFormat("yyyy-MM-");
        String startTime = sdfTwo.format(new Date()) + "01 00:00:00";
        String endTime = sdfTwo.format(new Date()) + maxDate + " 23:59:59";

        System.out.println(startTime);
        System.out.println(endTime);

        //获取当天开始时间
        LocalDateTime today_start = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        System.out.println(today_start);

        //获取当天结束时间
        LocalDateTime today_end = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
        System.out.println(today_end);

    }
}
