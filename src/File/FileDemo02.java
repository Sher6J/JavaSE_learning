package File;

import java.io.File;
import java.io.IOException;

/*
    File类创建功能：
        public boolean createNewFile(); 当具有该名称的文件不存在时, 创建一个由该抽象路径名命名的新空文件
            如果文件不存在, 就创建文件, 并返回true
            如果文件存在, 就不创建文件, 并返回false
        public boolean mkdir(); 创建由此抽象路径名命名的目录
            如果目录不存在, 就创建目录, 并返回true
            如果目录存在, 就不创建目录, 并返回false
        public boolean mkdirs(); 创建由此抽象路讲名命名的目录, 包括任何必须但不存在的父目录
            如果目录不存在, 就创建目录, 并返回true
            如果目录存在, 就不创建目录, 并返回false
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/home/liujx/JavaProjects/files/java.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("/home/liujx/JavaProjects/files/test");
        System.out.println(f2.mkdir());

        File f3 = new File("/home/liujx/JavaProjects/files/a/c/d/e");
        System.out.println(f3.mkdirs());

        f3.delete();

    }
}
