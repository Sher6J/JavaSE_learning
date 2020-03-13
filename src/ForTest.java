/*
    求1-100偶数和
 */
public class ForTest {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 ==0) {
                sum += i;
            }
        }

        System.out.println("result:" + sum);
    }
}
