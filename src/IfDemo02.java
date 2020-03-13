/*
    键盘输入一个星期数, 输出对应星期几
 */
import java.util.Scanner;
import java.util.StringJoiner;

public class IfDemo02 {
    public static void main(String[] args) {
        System.out.println("star");

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入星期数（1-7）：");
        int week = sc.nextInt();

        if (week == 1) {
            System.out.println("星期一");
        } else if (week == 2) {
            System.out.println("星期二");
        } else if (week == 3) {
            System.out.println("星期三");
        } else if (week == 4) {
            System.out.println("星期四");
        } else if (week == 5) {
            System.out.println("星期五");
        } else if (week == 6) {
            System.out.println("星期六");
        } else {
            System.out.println("星期日");
        }
    }
}
