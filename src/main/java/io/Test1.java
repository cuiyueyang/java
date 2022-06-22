package io;

/**
 * Created by cuiyueyang on 2020/5/28.
 */
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Send implements Runnable{//实现  Runnable 接口
    private PipedOutputStream pos = null;//管道输出流
    public Send(){
        this.pos = new PipedOutputStream();//实例化输出流
    }
    public void run(){
        String str = "Hello World !!!";
        try{
            this.pos.write(str.getBytes());//输出信息
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            this.pos.close();//关闭输出流
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public PipedOutputStream getPos() {//通过线程类得到输出流
        return pos;
    }
}

class Receive implements Runnable{//实例化 Runnable 接口
    private PipedInputStream pis = null;
    public Receive(){
        this.pis = new PipedInputStream();//实例化输入流
    }
    public void run(){
        byte b[] = new byte[1024];
        int len = 0;
        try{
            len = this.pis.read(b);//接收数据
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            this.pis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("接收的内容为：" + new String(b,0,len));
    }

    public PipedInputStream getPis() {
        return pis;
    }

}

public class Test1{
    public static void main(String[] args) {
        Send s = new Send();
        Receive r = new Receive();
        try {
            s.getPos().connect(r.getPis());//连接管道
        }catch (IOException e){
            e.printStackTrace();
        }
        new Thread(s).start();//启动线程
        new Thread(r).start();//启动线程
    }

}


