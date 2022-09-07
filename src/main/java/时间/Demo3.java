package 时间;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * <p>Description: hutool 操作时间</p>
 * <p>Date: 2021/5/31 16:38 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo3 {
    public static void main(String[] args) {
        // 字符串 转 date
        String date11 = "2021-08-23";
        Date date1 = DateUtil.parse(date11);
        System.out.println(date1);

        // 字符串 转 date
        String date22 = "20210823";
        Date date2 = DateUtil.parse(date22);
        System.out.println(date2);

        // 字符串 转 date
        String date33 = "2021年08月23日";
        Date date3 = DateUtil.parse(date33);
        System.out.println(date3);

        // date 转 字符串
        String a = DateUtil.formatDate(date3);
        System.out.println(a);

        System.out.println(new Date());

    }
}
