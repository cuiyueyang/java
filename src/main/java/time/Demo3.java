package time;

import cn.hutool.core.date.DateUtil;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * <p>Description: hutool 操作时间</p>
 * <p>Date: 2021/5/31 16:38 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo3 {
    private static ZoneId zone = ZoneId.systemDefault();
    public static void main(String[] args) {

        LocalDateTime cs = LocalDate.now().atStartOfDay();

        LocalDateTime startTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(1685953876000L), zone);

        System.out.println(startTime);
        // 字符串 转 date
        String date11 = "2021-08-23";
        Date date1 = DateUtil.parse(date11);
        System.out.println(date1);

        // 字符串 转 date
        String date22 = "20210823";
        Date date2 = DateUtil.parse(date22);
        System.out.println(date2);

        // 字符串 转 date
        String date33 = "2021年08月23日";
        Date date3 = DateUtil.parse(date33);
        System.out.println(date3);

        // date 转 字符串
        String a = DateUtil.formatDate(date3);
        System.out.println(a);

        System.out.println(new Date());

        Date date = DateUtil.parse("2018-06-16 10:00:00","yyyy-MM-dd HH:mm:ss");


        // 获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        // 将Date转换为Instant，Instant表示从1970-01-01T00:00:00Z开始的秒数和纳秒数的偏移量
        java.time.Instant instant = date.toInstant();
        // 将Instant与时区结合转换为ZonedDateTime，ZonedDateTime是带有时区的日期和时间
        java.time.ZonedDateTime zonedDateTime = instant.atZone(zoneId);
        // 从ZonedDateTime中提取LocalDateTime
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        System.out.println(localDateTime);

        char test1 = 's';
        System.out.println(test1);

    }
}
