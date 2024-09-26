package io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by cuiyueyang on 2020/5/28.
 */
public class Demo7 {

    /**
     * PipedOutputStream PipedInputStream 管道流
     * 对管道进行处理的流节点
     * java中可以用于线程之间的通信
     */

    public static void main(String[] args) {
        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream input = new PipedInputStream();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    output.write("Hello world,pipe!".getBytes());
                }catch (IOException e){
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    byte[] bytes = new byte[20];
                    int data = input.read(bytes);
                    while (data != -1){
                        System.out.println(new String(bytes));
                        data = input.read();
                    }
                }catch (IOException e){
                }finally {
                    try {
                        input.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        try{
            output.connect(input);
        }catch (Exception e){
            e.printStackTrace();
        }
        thread1.start();
        thread2.start();
    }
}
