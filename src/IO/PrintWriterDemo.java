package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
    字符打印流的构造方法
        PrintWriter(String fileName);
        PrintWriter(Writer out, boolean autoFlush);
            out: 字符输出流
            autoFlush: true, 则println, printf, 或format方法将刷新输出缓冲区
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
//        PrintWriter pw = new PrintWriter("pw.txt");

        /*pw.write("hello");
        pw.flush();*/
        PrintWriter pw = new PrintWriter(new FileWriter("pw1.txt"), true);//自动flush
        pw.println("hello");

    }

}
