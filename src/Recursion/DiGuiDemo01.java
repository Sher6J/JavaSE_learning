package Recursion;
/*
    求阶乘
 */
public class DiGuiDemo01 {
    public static void main(String[] args) {
        int res = jc(5);
        System.out.println("5的阶乘为：" + res);

    }

    public static int jc(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * jc(n - 1);
        }
    }
}
