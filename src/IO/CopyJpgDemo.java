package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：将图片复制到模块目录下的copy.jpg
 */
public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/liujx/图片/yoona01.jpg");

        FileOutputStream fos = new FileOutputStream("copy.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fos.close();
        fis.close();

    }
}
