package json;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;

/**
 * <p>Description: 字符串转json    转入和转出json格式要一致</p>
 * <p>Date: 2021/6/10 10:33 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Common.stra);
        String str1 = Common.stra;
        //字符串转json对象
        JSONObject json1 = new JSONObject(str1);
        System.out.println(json1);
        //json对象取值
        String title = json1.get("title").toString();
        System.out.println(title);
        //json对象取值
        String author = json1.getStr("author");
        System.out.println(author);
        String str2 = Common.strb;
        //字符串转json数组
        JSONArray jsonArray = new JSONArray(str2);
        System.out.println(jsonArray);
        Object json2 = jsonArray.get(0);
        System.out.println(json2);
    }
}
