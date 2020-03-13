/*
    奇偶数
 */
import java.util.Scanner;

public class Iftest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }

        System.out.println("end");
    }
}
