package 时间;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * <p>Description: </p>
 * <p>@date 2022/7/29 9:57</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test2 {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");

    public static void main(String[] args) {
        String str = "2022-07-28T12:43:50.725+08:00";
        String temp = str.substring(0, 23);
        LocalDateTime time = LocalDateTime.parse(temp);
        System.out.println(time.format(formatter));

        System.out.println(simpleDateFormat.format(new Date()));

        String str2 = "2022-07-28T12:43:50.725";
        LocalDateTime time2 = LocalDateTime.parse(str2);
        System.out.println(time2.format(formatter));
    }
}
