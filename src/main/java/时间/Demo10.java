package 时间;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>Description: 获取当天时间</p>
 * <p>@date 2022/9/23 17:25</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo10 {

    public static void main(String[] args) {
        LocalDateTime two = LocalDateTime.of(LocalDateTime.now().toLocalDate(), LocalTime.MIN.withHour(2));
        LocalDateTime five = LocalDateTime.of(LocalDateTime.now().toLocalDate(), LocalTime.MIN.withHour(2));
        System.out.println(two);
        System.out.println(five);
    }

}
