package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    字符流写数据的两个小问题：
        1. 字节流写数据如何实现换行？
            windows: \r\n
            linux: \n
            mac: \r

        2. 字节流写数据如何实现追加写入？
            public FileOutputStream​(String name, boolean append) throws FileNotFoundException
            创建文件输出流以写入具有指定名称的文件。 如果第二个参数是true ，则字节将写入文件的末尾而不是开头。
 */
public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/home/liujx/JavaProjects/learning/fos3.txt", true);

        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\n".getBytes());
        }

        fos.close();

    }
}
