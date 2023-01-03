package 时间;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * <p>Description: 时间戳</p>
 * <p>Date: 2021/8/30 13:31 </p>
 *
 * @version v1.0.0
 * @author: cuiyy
 */
public class Demo5 {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {

        //获取当前时时间戳
        System.out.println(System.currentTimeMillis());

        System.out.println(LocalDateTime.now().toString());

        System.out.println(Calendar.getInstance().getTimeInMillis());
        //时间戳转化为时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(System.currentTimeMillis()));

        long a = 1653875017635L;
        System.out.println(sdf.format(a));

        System.out.println(getDateTimeOfTimestamp(a));

        String str = "2022-01-01 00:00:00";
        System.out.println(LocalDateTime.parse(str, formatter));

        String nowMonth = String.valueOf(LocalDateTime.now().getMonth().getValue());
        System.out.println(nowMonth);

        Long ad = 1658994305666L;
        System.out.println(sdf.format(ad));

    }

    public static LocalDateTime getDateTimeOfTimestamp(long timestamp) {
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

}
