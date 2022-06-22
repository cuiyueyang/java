package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Description: 输入流测试
 * Created by cuiyueyang on 2020/5/28.
 */
public class Demo1 {
    //PrintWriter
    //BufferedReader 缓冲流，需要父类作为构造函数，增加缓冲功能，避免频繁读写硬盘
    //由于增加了缓冲功能，所以写数据的时候要用flush 方法。
    //另外BufferedReader提供了readLine方法，可以读取一行，向FileReader只能读取一个字节或字符
    public static void main(String[] args) throws IOException {
        PrintWriter out = null;
        BufferedReader br = null;
        try {
            System.out.println("请输入：");
            out = new PrintWriter(System.out,true);
            br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = br.readLine()) != null){
                if (line.equals("exit")){
                    System.exit(1);
                }
                out.print(line);
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            out.close();
            br.close();
        }
    }
}
