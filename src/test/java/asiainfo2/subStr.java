package asiainfo2;

import org.apache.commons.lang.StringUtils;

/**
 * Created by cuiyueyang on 2020/3/13.
 */
public class subStr {

    public static void main(String[] args) {
        String billId="57156538915";
        String strLast4 = StringUtils.substring(billId, -4, billId.length());
        System.out.println(strLast4);
    }

}
