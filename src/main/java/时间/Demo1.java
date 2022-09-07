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

    static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Timestamp getTimstampByString(String strDate, String mask) throws Exception {
        if(strDate == null) {
            return null;
        } else {
            DateFormat dateformat = new SimpleDateFormat(mask);
            return new Timestamp(dateformat.parse(strDate).getTime());
        }
    }

    public static void main(String[] args) throws Exception {
        //date 转化 字符串
        String validDate = df.format(new Date());
        System.out.println(validDate);
        //时间戳
        Timestamp validDate2= getTimstampByString((String) validDate, "yyyy-MM-dd HH:mm:ss");
        System.out.println(validDate2);
    }
}
