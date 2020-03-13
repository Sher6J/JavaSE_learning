package IO;

import java.io.*;

/*
    需求：把视频符合到当前目录下copy.mp4

    思路：
        1. 根据数据源创建字节输入流对象
        2. 根据目的地创建字节数出流对象
        3. 读写数据
        4. 释放资源

    四种方式, 并记录时间
        1. 基本字节流一次读写一个字节 //169150毫秒
        2. 基本字节流一次读写一个字节数组 //368毫秒
        3. 字节缓冲流一次读写一个字节 //1204毫秒
        4. 字节缓冲流一次读写一个字节数组 //239毫秒
 */
public class CopyMp4Demo {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        //复制视频
        //method1(); //169150毫秒
        //method2(); //368毫秒
        //method3(); //1204毫秒
        method4(); //239毫秒

        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
    }

    //1. 基本字节流一次读写一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("/home/liujx/视频/miniskirt.mp4");
        FileOutputStream fos = new FileOutputStream("copy.mp4");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fos.close();
        fis.close();
    }

    //2. 基本字符流一次填写一个字符数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("/home/liujx/视频/miniskirt.mp4");
        FileOutputStream fos = new FileOutputStream("copy.mp4");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fos.close();
        fis.close();
    }

    //3. 字节缓冲流一次读写一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/home/liujx/视频/miniskirt.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.mp4"));

        int by;
        while ((by = bis.read()) != -1){
            bos.write(by);
        }

        bos.close();
        bis.close();
    }

    //4. 字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/home/liujx/视频/miniskirt.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.mp4"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}
