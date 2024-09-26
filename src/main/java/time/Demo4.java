package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * <p>Description: 获取月份，天数</p>
 * <p>Date: 2021/6/3 15:37 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //今年的第几月
        int month = calendar.get(Calendar.MONTH);
        //当月的第几天
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        //今年的第几天
        int DAYOFYEAR = calendar.get(Calendar.DAY_OF_YEAR);
        //今天的第几个小时
        int HOUROFDAY = calendar.get(Calendar.HOUR_OF_DAY);
        //这个小时的第几分钟
        int MINUTE = calendar.get(Calendar.MINUTE);
        System.out.println(month);
        System.out.println(day);
        System.out.println(DAYOFYEAR);
        System.out.println(HOUROFDAY);
        System.out.println(MINUTE);
        int TICK = (DAYOFYEAR - 1) * 288 + (HOUROFDAY - 1) * 12 + (MINUTE / 5);
        System.out.println("hello");

        Random random = new Random(1);
        int a = random.nextInt();
        int b = random.nextInt();
        System.out.println(a+"|"+b);

        calendar.set(Calendar.YEAR, 2022);
        Date currYearFirst = calendar.getTime();
        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(currYearFirst);
        System.out.println(nowTime);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);

    }
}
