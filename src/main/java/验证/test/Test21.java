package 验证.test;

import net.sf.json.JSONArray;
import org.apache.commons.lang.math.NumberUtils;

/**
 * <p>Description: </p>
 * <p>@date 2022/9/13 10:41</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test21 {

    public static void main(String[] args) {
        String a = "021";
        System.out.println(NumberUtils.isNumber(a));
        System.out.println(Integer.valueOf(a));
        String b = "[\"ce2c1022-b487-4cba-b48a-dde13fdfee9f\"]";
    }

}