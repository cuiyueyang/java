package str;

/**
 * Description：字符串常用方法
 * Created by cuiyueyang on 2020/5/22.
 */
public class Demo1 {
    public static void main(String[] args) {

        //一.String类的获取功能
        String str = "A b12314|我爱Hi|bd@@@  ";
        //1.length() 计算字符串的长度，字符的个数
        System.out.println(str.length());
        //2.charAt() 获取指定索引处的字符
        System.out.println(str.charAt(5));
        //3.indexOf() 获取str在字符串对象中第一次出现的位置/索引
        System.out.println(str.indexOf("a"));
        //4.substring() 截取字符串
        System.out.println(str.substring(0,4));

        System.out.println("-----------------------");

        //二.String类的判断功能
        //1.equqls() 比较字符串内容是否相同
        System.out.println("aa".equals(str));
        //2.equalsIgnoreCase 比较字符串内容是否相同，忽略大小写
        System.out.println("aa".equalsIgnoreCase("AA"));
        //3.startWith 判断字符串对象是否以指定的字符开头
        System.out.println(str.startsWith("ab"));
        //4.startsWith(a,b) 判断字符串是否以指定字符开头，第二个参数未指定从哪个下标开始
        System.out.println(str.startsWith("b",1));
        //5.endsWith 判断字符串对象是否以指定的字符串结尾
        System.out.println(str.endsWith("@@@"));
        //6.ensWith 判断字符串第二个参数
        System.out.println(str.endsWith("b"));
        //7.toCharArray()
        char arr[] = str.toCharArray();
        System.out.println(arr);
        for (char arrs:arr){
            System.out.println(arrs);
        }
        //8.toLowerCase()  把字符串转换为小写符串
        System.out.println(str.toLowerCase().length());
        System.out.println(str.toLowerCase());

        System.out.println("--------------------");

        //三.其他常用方法
        //1.trim()去除字符串两端的空格
        System.out.println(str.trim().length());
        System.out.println(str.trim());
        //2.split() 按照字符串中指定的字符进行分割，然后返回字符串数组
        System.out.println(str.split("a"));
        String acc[] = str.split("b",5);
        System.out.println(acc.length);
        for (int i=0;i<acc.length;i++){
            System.out.println(acc[i]);
        }
        //3.subSequence 截取字符串中指定位置的字符串组成一个新的字符串,从开始算起/不带结束
        System.out.println(str.subSequence(1,3));
        System.out.println(str.subSequence(1,3).length());
        //4.replace() //将字符串替换为另一个字符
        System.out.println(str.replace("@","$"));
        //5.replaceAll() 使用新的内容代替全部旧的内容
        System.out.println(str.replaceAll("@","!"));
        //6.replaceFirst()
        System.out.println(str.replaceFirst("@","#"));
        //7.lastIndexOf()
        System.out.println(str.lastIndexOf("@"));
        //8.contains() 查看字符串中是否含有指定字符
        System.out.println(str.contains("@"));
        //9.在原有字符串的基础上加上指定字符串
        System.out.println(str.concat("@"));
    }
}
