package 时间;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * <p>Description: </p>
 * <p>Date: 2023/08/30 16:28</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test3 {

    public static void main(String[] args) {
        String dateStr = "2023-08-30T15:26:33.170+00:00";
        Date date = DateUtil.parse(dateStr);
        System.out.println(date);
    }

}
