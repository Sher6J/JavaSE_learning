package String;

import java.util.Scanner;

/*
    键盘录入字符串, 遍历该字符串

    遍历字符串, 首先能够获取到字符串中的每一个字符
        public char charAt (int index);
    获取字符串长度
        public int length();
 */
public class StringTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
