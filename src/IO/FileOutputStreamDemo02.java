package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    构造方法
        FileOutStream (String name); 创建文件输出流以指定的名字写入文件
        FileOutStream (File file); 创建文件输出流以写入由指定的File对象表示的文件
    写数据的三种方式：
        void write(int b); 将指定的字节写入此文件输出流
        一次写一个字节数据

        void write(byte[] b); 将b.length的字节从指定的字节数组写入此文件输出流
        一次写一个字符数组数据

        void write(byte[] b, int off, int len); 将len个字节从指定的字符数组从偏移量off开始写入此文件输出流
        一次写一个字符数组的部分数据
 */
public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/home/liujx/JavaProjects/learning/fos1.txt");

        fos.write(97);
        fos.write(98);
        fos.write(99);

        byte[] bys = {97, 98, 99};

        //byte[] getBytes(); 返回字符串对应的字节数组
        byte[] bytes = "fuck you".getBytes();

        fos.write(bys);
        fos.write(bytes);

        fos.close();
    }
}
