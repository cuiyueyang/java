package 验证.test;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>Description: </p>
 * <p>@date 2022/6/24 11:14</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test20 {

    public static void main(String[] args) {
        int b[][]={{1}, {2, 2}, {2, 2, 2}};
        int sum = 0;

        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length; j++) {
                int a = b[i][j];
                sum += a;
            }
        }
        System.out.println(sum);
        System.out.println("abc".substring(2,3));
    }
}
