package javabase;

import common.utils.FanXingUtils;
import org.apache.commons.compress.utils.Lists;
import java.util.List;

/**
 * <p>Description: 泛型测试</p>
 * <p>Date: 2021/6/2 09:48 </p>
 *
 * @version v1.0.0
 * @Author: cuiyy
 */
public class FanXing1 {
    public static void main(String[] args) {
        List<String> list1 = Lists.newArrayList();
        list1.add("1");
        System.out.println(FanXingUtils.length(list1));
    }
}
