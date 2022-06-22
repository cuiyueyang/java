package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * Created by cuiyueyang on 2020/5/28.
 */
public class Demo8 {
    //SequenceInputStream
    //可以当作一个工具类，将两个或者多个输入流当作一个输入流依次读取
    public static void main(String[] args) throws IOException {
        FileInputStream firstream1 = null;
        FileInputStream firstream2 = null;
        SequenceInputStream sistream = null;
        FileOutputStream fostream =null;
        try{
            firstream1 = new FileInputStream("F:/workspace/io/FileInputStreamTest.txt");
            firstream2 = new FileInputStream("F:/workspace/io/FileOutputStreamTest.txt");
            sistream = new SequenceInputStream(firstream1,firstream2);
            fostream = new FileOutputStream("F:/workspace/io/3.txt");
            int temp;
            while((temp = sistream.read()) != -1){
                System.out.println((char)temp);
                fostream.write(temp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            fostream.close();
            sistream.close();
            firstream1.close();
            firstream2.close();
        }
    }
}
