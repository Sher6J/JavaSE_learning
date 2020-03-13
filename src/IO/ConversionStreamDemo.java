package IO;

import java.io.*;

/*
    InputStreamReader: 是从字节流到字符流的桥梁
        读取字节, 并使用指定编码将其解码为字符
    OutputStreamWriter: 是从字符流到字节流的桥梁
        使用指定编码将字符编码为字节
 */
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
       /* OutputStreamWriter​(OutputStream out)
            创建使用默认字符编码的OutputStreamWriter
          OutputStreamWriter​(OutputStream out, String charsetName)
            创建使用指定charset的OutputStreamWriter*/
        /*FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);*/
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"), "GBK");
        osw.write("中国");
        osw.close();

        /*InputStreamReader​(InputStream in)
            创建一个使用默认字符集的InputStreamReader
          InputStreamReader​(InputStream in, String charsetName)
            创建一个使用指定charset的InputStreamReader*/
        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"), "GBK");

        //一次读取一个字符数据
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char)ch);
        }

        isr.close();


    }
}
