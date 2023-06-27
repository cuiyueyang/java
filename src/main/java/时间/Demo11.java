package 时间;

import cn.hutool.core.date.DateUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * <p>Description: </p>
 * <p>Date: 2023/04/23 16:04</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo11 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS+08:00");
        System.out.println(LocalDateTime.now().format(formatter));

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSzzz");
        LocalDateTime localDateTime =LocalDateTime.now();
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        String format = DateUtil.format(date, df);
        System.err.println(format);

//        2023-04-23T16:05:38.193CST;
//        2017-06-15T00:00:00.000+08:00;
//        2023-04-23T16:09:53.754+08:00
    }
}
