package Internet;

import java.io.IOException;
import java.net.*;

/*
    UDP发送数据的步骤
        1. 创建发送端的Socket对象(DatagramSocket)
        2. 创建数据,　并把数据打包
        3. 调用DatagramSocket对象的方法发送数据
        4. 关闭发送端
 */
public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte[] bys = "hello, udp, i'm coming".getBytes();
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("127.0.1.1");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys, length, address, port);
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("127.0.1.1"), 10086);

        ds.send(dp);

        ds.close();
    }
}
