package asiainfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cuiyueyang on 2019/12/29.
 */
public class 方法Test {

    public static String test1(Map map1){
        map1.put("1","2");
        return "2";
    }

    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        map1.put("1","1");
        String a = test1(map1);
        System.out.println(a+ map1.get("1"));
    }
}
