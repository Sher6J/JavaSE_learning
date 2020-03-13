package IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节缓冲流：
        BufferOutputStream
        BufferInputStream
    构造方法：
        字节缓冲输出流：BufferedOutputStream (OutputStream out)
        字节缓冲输入流：BufferedInputStream (InputStream in)
 */
public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        /*FileOutputStream fos = new FileOutputStream("bosbuff.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);*/
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bosbuff.txt"));

        //写数据
        bos.write("hello\n".getBytes());

        bos.close();

    }
}
