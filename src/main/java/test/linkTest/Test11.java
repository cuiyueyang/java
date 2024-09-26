package test.linkTest;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>Description: </p>
 * <p>Date: 2023/07/21 13:17</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test11 {

    public static void main(String[] args) {
        String phone = "13333956278";
        String str = StringUtils.repeat("*", 7);
        System.out.println(phone.substring(0,4)+str);
    }

}
