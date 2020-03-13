package String;

import java.util.Scanner;

/*
    字符串反转
 */
public class StringTest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();

        String res = reverse(line);

        System.out.println("反转后字符串为：" + res);
    }

    public static String reverse(String s) {
        String ss = "";

        for (int i = s.length() - 1; i > -1; i--) {
            ss += s.charAt(i);
        }

        return ss;
    }
}
