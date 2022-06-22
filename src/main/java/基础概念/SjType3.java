package 基础概念;

/**
 * <p>Description: 基本数据类型默认值</p>
 * <p>@date 2022/3/18 10:16</p>
 *
 * @author cuiyy
 * @version v1.0.0
 **/
public class SjType3 {
    public static void main(String[] args) {
        //byte：-2^7 ~ 2^7-1，即-128 ~ 127。1字节。Byte。末尾加B
        byte a = 0;
        //short：-2^15 ~ 2^15-1，即-32768 ~ 32767。2字节。Short。末尾加S
        short b = 0;
        //有符号int：-2^31 ~ 2^31-1，即-2147483648 ~ 2147483647。4字节。Integer
        int c = 0;
        //long：-2^63 ~ 2^63-1，即-9223372036854774808 ~ 9223372036854774807。8字节。Long。末尾加L
        long d = 0l;
        //double：8字节
        double e = 0.0;
        //float：4字节。Float。末尾加F
        float f = 0f;
        //boolean：Boolean
        boolean g = false;
        //char：2字节。Character 默认值是0对应的字符
        char h = 0;
        System.out.println(""+a+b+c+d+e+f+g+h);
    }
}
