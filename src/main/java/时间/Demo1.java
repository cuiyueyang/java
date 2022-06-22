package 时间;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description Date 时间格式转换
 * Created by cuiyueyang on 2020/5/22.
 */
public class Demo1 {
    public static Timestamp getTimstampByString(String strDate, String mask) throws Exception {
        if(strDate == null) {
            return null;
        } else {
            DateFormat dateformat = new SimpleDateFormat(mask);
            return new Timestamp(dateformat.parse(strDate).getTime());
        }
    }
    public static void main(String[] args) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        String validDate = df.format(new Date());
        System.out.println(validDate);
        Timestamp validDate2= getTimstampByString((String) validDate, "yyyy-MM-dd HH:mm:ss");
        System.out.println(validDate);
    }
}
