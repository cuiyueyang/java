package io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by cuiyueyang on 2020/5/28.
 */
public class Demo4 {
    //StringReader StringWriter 字符串流
    //StringReader能从String中读取数据并保存到char数组
    public static void main(String[] args) throws IOException {
        StringReader sr = null;
        StringWriter sw = null;
        try{
            String str = "学习不刻苦不如卖红薯";
            char[] buf = new char[32];
            int hasRead = 0;
            //StringReader将以String字符串为节点读取数据
            sr = new StringReader(str);
            while ((hasRead = sr.read(buf))>0){
                System.out.println(new String(buf,0,hasRead));
                System.out.println(buf);
            }
            //由于String是一个不可变类，因此创建StringWriter时，实际上是以
            //一个StringBuffer作为输出节点
            sw = new StringWriter();
            sw.write("黑夜给了我黑色的眼睛");
            sw.write("我却用它寻找光明");
            //toString()返回sw节点内的数据
            System.out.println(sw.toString());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sw.close();
            sr.close();
        }
    }
}
