package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/liujx/JavaProjects/learning/fos3.txt");

        //调用字节输入流对象的读数据方法
        //int read(); 从该输入流读取一个字节的数据
        /*int by = fis.read();
        System.out.println(by);
        System.out.println((char)by);*/

        //读取到文件末尾
        /*int by = fis.read();
        while (by != -1) {
            System.out.print((char)by);
            by = fis.read();
        }*/

        //优化上面代码
        int by;
        while ((by = fis.read()) != -1) {
            System.out.print((char)by);
        }

        fis.close();
    }
}
