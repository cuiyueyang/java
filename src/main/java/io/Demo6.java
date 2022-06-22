package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by cuiyueyang on 2020/5/28.
 */
public class Demo6 {
    //RandomAccessFile
    //RandomAccessFile 是java.io中的一个特殊的类，既不是输入流也不是输出流，它两者都可以做到，
    //支持对文件的随机访问
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = null;
        try{
            //创建一个RandomAccessFile对象
            randomAccessFile  = new RandomAccessFile("F:/workspace/io/FileInputStreamTest.txt","rw");

            byte[] bytes = new byte[(int)randomAccessFile.length()];
            int size = randomAccessFile.read(bytes);
            FileOutputStream fileOutputStream = new FileOutputStream("F:/workspace/io/3.txt");
            fileOutputStream.write(bytes);
            System.out.println("看一下成功了没"+size);

            //通过seek方法来移动指针
            randomAccessFile.seek(10);
            //获取当前指针
            long pointerBegin = randomAccessFile.getFilePointer();
            //从当前指针开始读
            byte[] contents = new byte[10];
            randomAccessFile.read(contents);
            long pointerEnd = randomAccessFile.getFilePointer();
            System.out.println("pointerBegin:"+pointerBegin+"pointerEnd:"+pointerEnd+"|"+new String(contents));
            randomAccessFile.seek(20);
            //获取当前指针
            long begin = randomAccessFile.getFilePointer();
            randomAccessFile.write(contents);
            long end = randomAccessFile.getFilePointer();
            System.out.println("begin:"+begin+"|"+"end:"+end);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            randomAccessFile.close();
        }
    }
}
