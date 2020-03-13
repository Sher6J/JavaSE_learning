package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
    构造方法：
        OutputStreamWriter (OutputStream out); 创建一个使用默认字符编码的OutputStreamWriter
    写数据的5种方式：
        void write (int c); 写一个字符
        void write (char[] cbuf); 写入一个字符数组
        void write (char[] cbuf, int off, int len); 写入字符数组的一部分
        void write (String str); 写一个字符串
        void write (String str, int off, int len); 写一个字符串的一部分
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("oswd.txt"));

        /*osw.write(97); //写一个字符, 但是在缓冲里, 还无法到文件里去
        osw.flush(); //刷新流, 数据即可到文件中
        osw.write(98);
        osw.flush();*/

        char[] chs = {'a' ,'b', 'c', 'd'};
//        osw.write(chs);
        osw.write(chs, 1, 3);

        osw.write("abced");
        osw.write("abced", 0, "anced".length());

        osw.close();

    }
}
