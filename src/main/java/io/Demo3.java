package io;

import java.io.*;

/**
 * Description: 读取文件内容
 * Created by cuiyueyang on 2020/5/28.
 */
public class Demo3 {

    /**
     * FileReader FilWriter  文件流
     * 直接操作文件与os底层交互，也被称作节点流
     */

    public static void main(String[] args) throws IOException {
        Reader reader = null;
        Writer writer = null;
        try{
            File readFile = new File("F:/workspace/io/FileInputStreamTest.txt");
            reader = new FileReader(readFile);
            File writeFile = new File("F:/workspace/io/FileOutputStreamTest.txt");
            writer = new FileWriter(writeFile);
            char[] byteArray = new char[(int) readFile.length()];
            int size = reader.read(byteArray);
            System.out.println("大小："+size+"个字符；内容："+new String(byteArray));
            writer.write(byteArray);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            reader.close();
            writer.close();
        }
    }
}
