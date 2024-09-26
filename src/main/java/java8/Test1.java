package java8;

import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>Description: </p>
 * <p>Date: 2023/04/04 17:29</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test1 {

    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();
        list.add("as");
        list.add("bs");
        list.add("cs");
        list.add("de");
        list.add("es");
        list = list.stream().filter(x->!x.contains("cs")).collect(Collectors.toList());
        System.out.println(list);
    }

}
