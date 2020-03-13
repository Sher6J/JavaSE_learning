package Internet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
    TCP发送数据的步骤：
        1. 创建客户端的Socket对象(Socket)
        2. 获取输出流, 写数据
        3. 释放资源
 */
public class TCPClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
        //Socket​(InetAddress address, int port); 创建流套接字并将其连接到指定IP地址处的指定端口号
//        Socket s = new Socket(InetAddress.getByName("127.0.1.1"), 10000);
        //Socket​(String host, int port); 创建流套接字并将其连接到指定主机上的指定端口号
        Socket s = new Socket("127.0.1.1", 10000);

        //获取输出流, 写数据
        //OutputStream	getOutputStream(); 返回此套接字的输出流
        OutputStream os = s.getOutputStream();
        os.write("hello, tcp, i'm coming".getBytes());

        s.close();


    }
}
