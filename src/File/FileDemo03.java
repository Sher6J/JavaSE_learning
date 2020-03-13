package File;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        File f = new File("learning/java.txt");

        System.out.println(f.getAbsoluteFile());
    }
}
