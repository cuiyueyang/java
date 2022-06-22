package 网络编程;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by cuiyueyang on 2020/6/1.
 */
//客户端
public class Demo2 {
    public static void main(String[] args) throws IOException {
        int port = 7000;
        String host = "localhost";

        //创建一个套接字并将其连接到指定端口号
        Socket socket = new Socket(host,port);

        DataInputStream dis =  new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag){
            System.out.println("请输入正方形的边长：");
            double length = sc.nextDouble();
            dos.writeDouble(length);
            dos.flush();

            double area = dis.readDouble();

            System.out.println("服务器返回计算面积为："+area);

            while (true){
                System.out.println("是否继续计算？（Y/N）");
                String str = sc.next();
                if (str.equalsIgnoreCase("N")){
                    dos.writeInt(0);
                    dos.flush();
                    flag=true;
                    break;
                }else if (str.equalsIgnoreCase("Y")){
                    dos.writeInt(1);
                    dos.flush();
                    break;
                }
            }
        }
        socket.close();
    }
}
