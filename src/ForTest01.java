/*
    水仙花：在控制台输出所有的水仙花数
 */
public class ForTest01 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
                System.out.println(i);
            }
        }
    }
}
