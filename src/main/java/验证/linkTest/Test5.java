package 验证.linkTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>Description: </p>
 * <p>@date 2022/7/12 14:04</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test5 {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    public static void main(String[] args) {
        System.out.println(LocalDateTime.parse("2022-07-01 00:00:59",formatter));

        LocalDateTime passTime = LocalDateTime.now();
        LocalDateTime begin = LocalDateTime.of(passTime.toLocalDate(), LocalDateTime.MIN.toLocalTime());
        System.out.println(begin);
    }

}
