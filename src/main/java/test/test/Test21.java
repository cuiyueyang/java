package test.test;

import cn.hutool.crypto.digest.MD5;
import org.apache.commons.lang.math.NumberUtils;

import java.time.LocalDate;

/**
 * <p>Description: </p>
 * <p>@date 2022/9/13 10:41</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test21 {

    public static void main(String[] args) {
        String data = "浙DX2745" + "_" + 2 + "_" + LocalDate.now();
        String id = MD5.create().digestHex(data);
        System.out.println(id);


        System.out.println(Math.round(Double.valueOf(2)/3));

        String a = "021";
        System.out.println(NumberUtils.isNumber(a));
        System.out.println(Integer.valueOf(a));
        String b = "[\"ce2c1022-b487-4cba-b48a-dde13fdfee9f\"]";
    }

}