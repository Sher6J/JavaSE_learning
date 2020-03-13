package IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    打印流的特点：
        只负责输出数据, 不负责读取数据
        有自己的特有方法
    字节打印流：
        PrintStream (String fileName); 使用指定文件名创建新的打印流
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("ps.txt");

        //字节输出流有的方法
//        ps.write(97);  // a
        ps.print(97);  //97
        ps.close();
    }
}
