package IO;

import java.io.*;

/*
    字符缓冲流：
        BufferedWriter
        BufferedReader
    构造方法：
        BufferedWriter(Writer out);
        BufferedReader(Reader in);
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        /*BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

        bw.write("hello\n");
        bw.write("world");
        bw.close();*/

        BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

        /*//一次读一个字符数据
        int ch;
        while ((ch = br.read()) != -1) {
            System.out.print((char)ch);
        }*/

        //一次读一个字符数组数据
        char [] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        br.close();
    }
}
