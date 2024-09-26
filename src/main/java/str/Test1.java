package str;

import org.apache.commons.lang.StringUtils;

/**
 * <p>Description: 字符串脱敏</p>
 * <p>@date 2022/3/18 14:20</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test1 {
    public static void main(String[] args) {
        String name = "慕行秋cs";
        name = name.substring(0,1) + StringUtils.repeat("*", name.length()-1);
        System.out.println(name);
        String id = "411123199511209116";
        id = id.substring(0, 6) + StringUtils.repeat("*", id.length()-10) + id.substring(14, 18);
        System.out.println(id);
    }
}
