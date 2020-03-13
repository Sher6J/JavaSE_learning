package IO;

import java.io.PrintStream;

/*
    public static final PrintStream out; 标准输出流, 通常该流对应于显示输出或由主机环境或用户指定的另一个输出目标
 */
public class SystemOutDemo {
    public static void main(String[] args) {
        PrintStream ps = System.out;

        /*ps.print("hello");
        ps.print(100);*/
        ps.println(100);
        ps.println("hello");

        //System.out的本质是一个字节输出流
        System.out.println("hello");
    }
}
