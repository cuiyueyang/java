package test.linkTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

/**
 * <p>Description: </p>
 * <p>@date 2022/7/23 15:00</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test6 {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    public static void main(String[] args) {


        String startDate = LocalDateTime.of(LocalDate.now().minusDays(7), LocalDateTime.MIN.toLocalTime()).format(formatter);
        String endDate = LocalDateTime.of(LocalDate.now(), LocalDateTime.MAX.toLocalTime()).format(formatter);
        System.out.println(startDate);
        System.out.println(endDate);

        Integer a = 1-2;
        System.out.println(a);

        HashMap<String, Integer> map = new HashMap<>();
        String industry = "03000";
        String key = industry.substring(3,4);
        map.put(key,map.getOrDefault(key,0)+1);
        System.out.println(map);

        if (industry.startsWith("031") && !industry.startsWith("0310") ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
