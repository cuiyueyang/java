package io;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/**
 * Created by cuiyueyang on 2020/5/28.
 */
public class Demo9 {

    /**
     * pushbackReader 继承reader抽象类
     */

    public static void main(String[] args) {
        try(PushbackReader pr = new PushbackReader(new FileReader("F:/workspace/io/FileInputStreamTest.txt"),64)){
            char[] buf = new char[32];
            String lastContent = "";
            int hasRead = 0;
            while ((hasRead = pr.read(buf))>0){
                String content = new String(buf,0,hasRead);
                int targetIndex = 0;
                if((targetIndex = (lastContent + content).indexOf("A"))>0){
                    System.out.println(targetIndex);
                    pr.unread((lastContent+content).toCharArray());
                    if (targetIndex > 32){
                        buf = new char[targetIndex];
                    }
                    pr.read(buf,0,targetIndex);
                    System.out.println(new String(buf,0,targetIndex));
                    System.out.println(new String(buf,targetIndex,buf.length-targetIndex));
                    System.exit(0);
                }else {
                    System.out.println(lastContent);
                    lastContent = content;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
