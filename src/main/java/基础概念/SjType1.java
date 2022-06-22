package 基础概念;

import java.text.DecimalFormat;

/**
 * <p>Description: 保留两位小数</p>
 * <p>@date 2021/10/27 10:33</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class SjType1 {

    /**保留两位小数*/
    static DecimalFormat df  = new DecimalFormat("#.00");

    public static void main(String[] args) {
        int a = 1081;
        int b = 10000;
        Double c = Double.valueOf(a*100) / Double.valueOf(b);
        System.out.println(c);
        System.out.println(df.format(c) + "%");
    }
}
