package Internet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器, 接收到的数据写入文本文件, 给出反馈
 */
public class TCP5ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedWriter bw = new BufferedWriter(new FileWriter("TCP5.txt"));

        String line;
        while ((line = br.readLine()) != null) { //等待读取数据, 除非客户端说明数据已发送完毕
//            if ("886".equals(line)){
//                break;
//            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        System.out.println("222");

        //给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        bw.close();
        ss.close();
    }
}
