package 字符串;

/**
 * <p>Description: String、StringBuilder和StringBuffer</p>
 * <p>@date 2022/3/18 10:53</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class Demo5 {

    /**
     * String、StringBuilder和StringBuffer
     * 1）String是不可变字符序列，StringBuilder和StringBuffer是可变字符序列。
     * 2）执行速度StringBuilder > StringBuffer > String。
     * 3）StringBuilder是非线程安全的，StringBuffer是线程安全的。
     *
     */

    public static void main(String[] args) {
        String str = "a";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuilder.append(str);
        stringBuffer.append(str);
        System.out.println(str);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
    }
}
