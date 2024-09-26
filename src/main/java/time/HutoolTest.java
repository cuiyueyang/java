package time;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;

import java.time.LocalDateTime;

/**
 * <p>Description: </p>
 * <p>Date: 2024/01/02 09:36</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class HutoolTest {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String time1 = DateUtil.format(now, DatePattern.NORM_DATETIME_PATTERN);
        LocalDateTime time2 = DateUtil.parseLocalDateTime(time1, DatePattern.NORM_DATETIME_PATTERN);
        System.out.println(time1);
        System.out.println(time2);
    }

}
