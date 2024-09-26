package test.linkTest;

/**
 * <p>Description: split</p>
 * <p>@date 2022/4/19 15:44</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test4 {
    public static void main(String[] args) {

        String str = "崔越洋（123），崔冰洋（1234），崔dd洋（dd）";
        String[] strs = str.split("），");
        String[] str2 = new String[strs.length];
        int i = 0;
        for (String str1 : strs) {
            str2[i] = str1.split("（")[0];
            System.out.println(str1.split("（")[0]);

            if (i+1 != strs.length) {
                System.out.println(str1.split("（")[1]);
            } else {
                System.out.println(str1.split("（")[1].split("）")[0]);
            }
            i++;
        }
        for (String strc : str2)
        System.out.println(strc);
    }
}
