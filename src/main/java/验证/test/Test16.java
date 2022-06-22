package 验证.test;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Description: </p>
 * <p>@date 2022/3/31 16:20</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test16 {

    public static void main(String args[]) {
        List Listlist1 = new ArrayList();
        Listlist1.add(0);
        List Listlist2 = Listlist1;
        System.out.println(Listlist1.get(0) instanceof Integer);
        System.out.println(Listlist2.get(0) instanceof Integer);
    }

}
