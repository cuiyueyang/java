package asiainfo2;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cuiyueyang on 2020/5/13.
 */
public class demo1 {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(df.format(new Date()));
        String a = df.format(new Date());
        System.out.println(a);
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy|MM|dd");
        System.out.println(df1.format(new Date()));
    }
}
