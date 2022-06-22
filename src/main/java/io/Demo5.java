package io;

import java.io.*;

/**
 * Description: 字符流转化为字节流
 * Created by cuiyueyang on 2020/5/28.
 */
public class Demo5 {
    //FileInputStream reader  文件流
    //直接操作文件，直接与os系统底层交互，因此也被称为节点流
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        Reader reader = null;
        try{
            File file = new File("F:/workspace/io/FileInputStreamTest.txt");
            is = new FileInputStream(file);
            reader = new InputStreamReader(is,"utf-8");
            char[] byteArray = new char[(int) file.length()];
            System.out.println(new String(byteArray)+"|"+byteArray.toString()+"|"+byteArray.length);
            int size = reader.read(byteArray);
            System.out.println("大小："+size+"内容："+new String(byteArray)+byteArray+"|"+byteArray.toString());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            reader.close();
            is.close();
        }
    }
}
