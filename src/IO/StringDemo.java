package IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
    编码：
        byte[] getBytes(); 使用平台默认字符集将该String编码成一系列字节, 将结果存储到新的字节数组中
        byte[] getBytes(String charsetName); 使用指定字符集将该String编码为一系列字节, 将结果存储到新的字节数组中
    解码：
        String(byte[] bytes); 通过使用平台默认字符集解码指定字节数组来构造新的String
        String(byte[] bytes, String charsetName); 使用指定字符集解码指定字节数组构造新的String
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";

        byte[] bys = s.getBytes();
        System.out.println(Arrays.toString(bys)); //[-28, -72, -83, -27, -101, -67]

        byte[] bytes = s.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes)); //[-28, -72, -83, -27, -101, -67]

        byte[] bytes1 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1)); //[-42, -48, -71, -6]

        String s1 = new String(bys);
        System.out.println(s1); // 中国

        String s2 = new String(bys, "GBK");
        System.out.println(s2); //涓浗
    }
}
