package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>Description: localdateTime localDate 相互转化</p>
 * <p>@date 2022/3/3 14:06</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo7 {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().toLocalDate());
        System.out.println(LocalDateTime.of(LocalDateTime.now().toLocalDate(), LocalDateTime.MIN.toLocalTime()));
    }
}
