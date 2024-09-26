package test.linkTest;

import java.math.BigDecimal;

/**
 * <p>Description: </p>
 * <p>Date: 2023/07/19 13:34</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test10 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(0.0);
        System.out.println(Double.valueOf(String.valueOf(bigDecimal))/3);
        if (bigDecimal.equals(0.0)) {
            System.out.println(2);
        }
        Double a = 0.00;
        if (a.equals(0.0)) {
            System.out.println(1);
        }
    }
}
