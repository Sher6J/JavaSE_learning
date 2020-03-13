package Internet;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来源自文本文件
 */
public class TCP4ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.31.85", 10000);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("student.txt"));

        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        s.close();

    }
}
