package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cuiyueyang on 2020/6/1.
 */
//服务器（多线程版本）
public class Demo3 {
    public static void main(String[] args) throws IOException {
        int port = 7000;
        int clientNo = 1;
        ServerSocket serverSocket = new ServerSocket(port);
        //创建线程池
        ExecutorService exec = Executors.newCachedThreadPool();

        try{
            while (true){
                Socket socket = serverSocket.accept();
                exec.execute(new SingleServer(socket,clientNo));
                clientNo++;
            }
        }finally {
            serverSocket.close();
        }
    }
}

class SingleServer implements Runnable{
    private Socket socket;
    private int clientNo;

    public SingleServer(Socket socket,int clientNo){
        this.socket = socket;
        this.clientNo = clientNo;
    }
    public void run(){
        try{
            DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            do{
                double length = dis.readDouble();
                System.out.println("从客户端"+clientNo+"接收到边长数据为："+length);
                double result = length*length;
                dos.writeDouble(result);
                dos.flush();
            }while (dis.readInt() != 0);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("与客户端"+clientNo+"通信结束");
            try {
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
