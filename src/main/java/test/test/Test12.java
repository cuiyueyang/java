package test.test;

/**
 * <p>Description: </p>
 * <p>@date 2022/2/17 15:18</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Test12 {

    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 1:
                ++num;
            case 2:
                ++num;
            case 3:
                ++num;
            default:
                ++num;
                break;
        }
        System.out.println(num);
    }

}
