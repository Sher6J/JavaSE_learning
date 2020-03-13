/*
    三个和尚升级：身高未知
 */
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个和尚的身高：");
        int h1 = sc.nextInt();
        System.out.println("请输入第一个和尚的身高：");
        int h2 = sc.nextInt();
        System.out.println("请输入第一个和尚的身高：");
        int h3 = sc.nextInt();

        int tempH = h1 > h2 ? h1 : h2;

        int maxH = tempH > h3 ? tempH : h3;

        System.out.println("三个和尚中最高的是: " + maxH + "cm");
    }
}
