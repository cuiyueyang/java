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
        long second = System.currentTimeMillis();
        LocalDateTime dateTime1 = Instant.ofEpochMilli(second).atZone(ZoneOffset.ofHours(8)).toLocalDateTime();
        System.out.println(dateTime1);

        long posTime = 1687250324914L;
        // 将时间戳转为当前时间
        LocalDateTime dateTime2 = Instant.ofEpochMilli(posTime).atZone(ZoneOffset.ofHours(8)).toLocalDateTime();
        // 2020-02-03T13:30:44
        System.out.println(dateTime2);
    }

}
