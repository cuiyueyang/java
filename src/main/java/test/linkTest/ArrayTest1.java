package test.linkTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>Description: </p>
 * <p>Date: 2024/08/29 11:15</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class ArrayTest1 {

    private static LocalDate now = LocalDate.now();
    public static void main(String[] args) {
        LocalDateTime time1 = LocalDateTime.now().minusMinutes(1);
        LocalDateTime time2 = LocalDateTime.now();
        if (time1.isBefore(time2)) {
            System.out.println(1111);
        }

        if (!now.equals(LocalDate.now())) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};
        int[] numbers = new int[100000];
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 100000; i++) {
            numbers[i] = 0 + 1 + i;
        }
        System.out.println(System.currentTimeMillis());
    }

}
