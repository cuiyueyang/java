package 验证.demo;

import cn.hutool.json.JSONObject;
import json.Common;

/**
 * <p>Description: </p>
 * <p>Date: 2021/7/8 11:05 </p>
 *
 * @version v1.0.0
 * @author: cuiyy
 */
public class Demo9 {

    private static String jsonStr = Common.strStudent;

    public static void main(String[] args) {
        JSONObject json = new JSONObject(jsonStr);
        System.out.println(json);
        //验证如果key不存在  返回值是错还是 null    null
        System.out.println(json.get("aa"));

        //字符串去除空格
        String plateNumber = "和adbd ";
        plateNumber = plateNumber.replace(" ", "");
        System.out.println("1"+plateNumber+"1");
    }
}
