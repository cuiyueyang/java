package asiainfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cuiyueyang on 2019/12/20.
 */
public class mapUpdate {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<String ,String >();
        map.put("1","zhangsan");
        System.out.println(map.get("1"));
        map.put("1","lisi");
        System.out.println(map.get("1"));
    }
}
