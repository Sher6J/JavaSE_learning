package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
    public static final InputStream in; 标准输入流, 通常该流对应键盘输入或主机环境或用户指定的另一个输入源
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        /*InputStream is = System.in;

        int by;
        while ((by = is.read()) != -1) {
            System.out.print((char)by);
        }

        //如何把字节流转换为字符流？用转换流
        InputStreamReader isr = new InputStreamReader(is);
        //使用字符流可以实现一次读取一行数据吗？可以
        //但是, 一次读取一行数据的方法是字符缓冲输入流的特有方法
        BufferedReader br = new BufferedReader(isr);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个字符串：");
        String line = br.readLine();
        System.out.println("你输入的字符串是：" + line);

        //自己实现键盘录入数据太麻烦了, 所以Java就提供了一个类供我们使用！
        Scanner sc = new Scanner(System.in);
    }
}
