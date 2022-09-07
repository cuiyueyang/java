package 时间;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * <p>Description: localDateTime localDate 时间格式转换，最大最小时间取值</p>
 * <p>@date 2021/11/1 13:17</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo6 {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static DateTimeFormatter formatterDay = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    public static LocalDateTime localDateToLocalDateTime(LocalDate localDate) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
        Date date =  Date.from(instant);
        instant = date.toInstant();
        zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    public static void main(String[] args) {

        System.out.println(LocalDateTime.of(LocalDate.parse("2022-08-01", formatterDay), LocalDateTime.MAX.toLocalTime()));


        //当前 localDateTime 转 字符串
        System.out.println(LocalDateTime.now().format(formatter));
        //localDate 转 localDateTime
        System.out.println(localDateToLocalDateTime(LocalDate.now().minusDays(3)).format(formatter));

        //获取最大/最小时间
        System.out.println(LocalDateTime.MIN);
        System.out.println(LocalDateTime.MAX);

        LocalDateTime a = LocalDateTime.of(LocalDate.now(), LocalDateTime.MIN.toLocalTime());
        LocalDateTime b = LocalDateTime.of(LocalDate.now(), LocalDateTime.MAX.toLocalTime());
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.format(formatter));
        System.out.println(b.format(formatter));

        String time = a.format(formatter);
        LocalDateTime localDateTime = LocalDateTime.parse(time, formatter);
        System.out.println(localDateTime);

        System.out.println(LocalDateTime.of(LocalDate.now().minusDays(2), LocalDateTime.MIN.toLocalTime()).format(formatter));
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalDateTime.MAX.toLocalTime()).format(formatter));

        //获取localDateTime 最大值，最小值
        LocalDateTime startTime = LocalDate.now().minusDays(30L).atStartOfDay();
        System.out.println(startTime);
        System.out.println(startTime.with(LocalTime.MAX));
    }
}
