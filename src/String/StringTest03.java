package String;

import java.util.Scanner;

/*
    键盘录入一个字符串, 统计该字符串中大写字母字符, 小写字母字符, 数字字符出现的次数（不考虑其他字符）
 */
public class StringTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numCount++;
            }
        }

        System.out.println("大写字符个数：" + bigCount);
        System.out.println("小写写字符个数：" + smallCount);
        System.out.println("数字字符个数：" + numCount);

    }
}
