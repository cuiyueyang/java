package io;

import java.io.*;

/**
 * Description: 文件读取，写出
 * Created by cuiyueyang on 2020/5/28.
 */
public class Demo2 {
    //FileInputStream FileOutputStream
    //文件流，直接操作文件，与os底层交互，因此也被称为节点流
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try{
            //在try()中打开文件会在结尾自动关闭
            is = new FileInputStream("F:/workspace/io/FileInputStreamTest.txt");
            os = new FileOutputStream("F:/workspace/io/FileOutputStreamTest.txt");
            byte[] buf = new byte[100];
            int hasRead = 0;
            while ((hasRead=is.read(buf))>0){
                os.write(buf,0,hasRead);
                System.out.println(hasRead);
                System.out.println(is);
                System.out.println(os);
                System.out.println(buf);
            }
            System.out.println("write success");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            os.close();
            is.close();
        }
    }
}
