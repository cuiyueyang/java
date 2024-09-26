package time;

import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * <p>Description: 保留两位小数</p>
 * <p>@date 2021/12/8 17:14</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test1 {

    public static void main(String[] args) {

        String a = null;
        System.out.println(StringUtils.isNotBlank(a));


        System.out.println(timeChange(new Date()));
        /**保留两位小数*/
        DecimalFormat df  = new DecimalFormat("#0.00");
        System.out.println(df.format(new Double(364500)/60/60));

        System.out.println(LocalDate.now());

        LocalDate time1 = LocalDate.now().minusDays(1);
        LocalDate time2 = LocalDate.now();
        LocalDate time3 = LocalDate.now().plusDays(1);
        System.out.println(time2.isAfter(time1));






    }


    private static LocalDateTime timeChange(java.util.Date date) {
        LocalDateTime date2 = null;
        if (date != null) {
            java.util.Date date1 = new Date(date.getTime());
            Instant instant = date1.toInstant();
            ZoneId zoneId = ZoneId.systemDefault();
            date2 = instant.atZone(zoneId).toLocalDateTime();
        }
        return date2;
    }
}
