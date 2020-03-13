package StringBuiler;

import java.util.Scanner;

/*
    字符串反转
 */
public class StringBuilderTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();

        String reverse = reverse(s);
        System.out.println("反转后：" + reverse);

    }
    public static String reverse(String s) {
        /*StringBuilder sb = new StringBuilder(s);
        String ss = sb.reverse().toString();
        return ss;*/
        return new StringBuilder(s).reverse().toString();
    }
}
