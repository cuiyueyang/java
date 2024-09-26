package test.linkTest;

import org.apache.commons.compress.utils.Lists;

import java.util.List;

/**
 * <p>Description: </p>
 * <p>@date 2021/12/21 10:47</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test1 {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();
        list.add("04");
        System.out.println(Integer.valueOf(list.get(0)));
    }
}
