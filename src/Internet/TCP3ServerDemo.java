package Internet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器, 接收到的数据写入文本文件
 */
public class TCP3ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //把数据写入到文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("TCPs.txt"));

        String line;
        while ((line = br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        ss.close();

    }
}

