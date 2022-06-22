package 时间;

import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * <p>Description: 保留两位小数</p>
 * <p>@date 2021/12/8 17:14</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test1 {

    public static void main(String[] args) {
        /**保留两位小数*/
        DecimalFormat df  = new DecimalFormat("#0.00");
        System.out.println(df.format(new Double(364500)/60/60));

        System.out.println(LocalDate.now());

        LocalDate time1 = LocalDate.now().minusDays(1);
        LocalDate time2 = LocalDate.now();
        LocalDate time3 = LocalDate.now().plusDays(1);
        System.out.println(time2.isAfter(time1));



    }
}
