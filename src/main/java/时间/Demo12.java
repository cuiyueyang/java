package 时间;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * <p>Description: </p>
 * <p>Date: 2023/06/16 14:14</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo12 {

    public static void main(String[] args) {
        //获得时间戳
//        long second = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).getEpochSecond();

        long posTime = 1686926331000L;
        // 将时间戳转为当前时间
        LocalDateTime dateTime = Instant.ofEpochMilli(posTime).atZone(ZoneOffset.ofHours(0)).toLocalDateTime();
        // 2020-02-03T13:30:44
        System.out.println(dateTime);
    }

}
