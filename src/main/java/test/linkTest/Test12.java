package test.linkTest;

import common.utils.DesensitizedUtil;

/**
 * <p>Description: </p>
 * <p>Date: 2023/07/24 09:28</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test12 {

    public static void main(String[] args) {

        //脱敏封装方法
        String address = "123456789123456789";
        System.out.println(DesensitizedUtil.address(address, address.length()-6));

        System.out.println(DesensitizedUtil.idCardNum("411123199610209716", 6, 4));

        System.out.println(DesensitizedUtil.chineseName("崔越洋"));

        //正则校验
        String aaaaa = "^([京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[a-zA-Z](([a-zA-Z]((?![IO])[a-zA-Z0-9](?![IO]))[0-9]{4})|([0-9]{5}[DF]))|[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1})$";
        String REGEX = "^([京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[a-zA-Z](([a-zA-Z]((?![IO])[a-zA-Z0-9](?![IO]))[0-9]{4})|([0-9]{5}[DF]))|[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1})$";
        String plateNumber = "浙B39778";
        if (plateNumber.matches(REGEX)) {
            System.out.println(1);
        }

    }

}
