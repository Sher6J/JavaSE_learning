package Internet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器, 接收到的数据在控制台输出
 */
public class TCP2ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10000);

        //监听客户i端连接, 返回对应的Socket对象
        Socket s = ss.accept();

        //获取输入流
//        InputStream is = s.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        ss.close();
    }
}
