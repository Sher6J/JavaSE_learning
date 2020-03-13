package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/liujx/JavaProjects/learning/fos3.txt");

        byte[] bys = new byte[5];
        int len = fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys));

        fis.close();
    }
}
