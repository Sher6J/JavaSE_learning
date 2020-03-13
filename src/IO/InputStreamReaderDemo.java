package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    构造方法：
        InputStreamReader (InputStream in); 创建一个使用默认字符集的InputStreamReader
    读数据的2种方式：
        int read (); 一次读一个字符数据
        int read (char[] cbuf); 一次读一个字符数组数据
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("oswd.txt"));

        /*int ch;
        while ((ch = isr.read())!=-1) {
            System.out.print((char)ch);
        }*/

        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            System.out.println(new String(chs, 0, len));
        }

        isr.close();
    }
}
