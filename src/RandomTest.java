/*
    猜数字
 */
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入猜的数字");
            int guess = sc.nextInt();

            if (guess > num) {
                System.out.println("猜大了");
            } else if (guess < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
