package Internet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    客户端：发送数据, 接受服务器反馈
    先写数据, 后读数据
 */
public class TCP1ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.1.1", 10000);

        OutputStream os = s.getOutputStream();
        os.write("hello, tcp, I'm coming!".getBytes());

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("客户端：" + data);

        s.close();
    }
}
