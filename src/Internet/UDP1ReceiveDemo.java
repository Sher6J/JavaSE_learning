package Internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
    UDP接受数据：
        因为接收端不知道发送什么时候停止发送, 故采用死循环接受
 */
public class UDP1ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        DatagramSocket ds = new DatagramSocket(12345);

        while (true) {
            //创建数据包接受数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            ds.receive(dp);

            System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }

        //ds.close();
    }
}
