package 时间;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>Description: java时间类练习</p>
 * <p>Date: 2021/5/31 10:01 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo2 {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private int a;

    public Demo2() {
        System.out.println("hello2");
    }{
        System.out.println("hello4");
    }

    static {
        System.out.println("hello3");
    }

    @PostConstruct
    private static void initTotal() {
        System.out.println("hello1");
    }

    public void sout() {
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        String startTime = "2020-05-26";
        LocalDateTime startDateTime = LocalDate.parse(startTime,formatter).atStartOfDay();
        System.out.println(startDateTime);
        String endTime = "2021-05-26";
        LocalDateTime endDateTime = LocalDate.parse(endTime,formatter).plusDays(1L).atStartOfDay();
        System.out.println(endDateTime);
        Demo2 demo2 = new Demo2();
        demo2.sout();
    }
}
