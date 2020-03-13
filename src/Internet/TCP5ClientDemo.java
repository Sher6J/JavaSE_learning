package Internet;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来源于文件, 接受服务器反馈
 */
public class TCP5ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.31.85", 10000);

        BufferedReader br = new BufferedReader(new FileReader("student.txt"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        System.out.println("111");

        //自定义结束标记
//        bw.write("886"); //但是如果文件中有886呢？只会传输到文件中到886的部分！！！
//        bw.newLine();
//        bw.flush();

        //public void shutdownOutput()
        s.shutdownOutput();

        //接受反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine(); //也在等待服务端的反馈数据
        System.out.println("服务器的反馈：" + data);

        br.close();
        s.close();

    }
}
