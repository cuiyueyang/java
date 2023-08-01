package 时间;

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

    }
}
