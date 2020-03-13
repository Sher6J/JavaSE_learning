package Debug;
/*
    查看循环求偶数和的执行流程
 */
public class DebugTest01 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("1-10间偶数和为：" + sum);
    }
}
