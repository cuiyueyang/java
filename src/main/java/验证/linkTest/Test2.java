package 验证.linkTest;

import org.apache.commons.compress.utils.Lists;

import java.util.List;

/**
 * <p>Description: </p>
 * <p>@date 2022/3/4 14:57</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test2 {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();
        list.add("2");
        list.add(0,"1");
        System.out.println(list);
    }
}
