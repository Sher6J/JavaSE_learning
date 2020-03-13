package Debug;

import java.util.Scanner;
/*
    导包：
        1. 手动导包 import java.util.Scanner;
        2. 快捷键导包 Alt+Enter
        3. 自动导包
 */
/*
    查看方法调用的流程
 */
public class DebugTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please input the first integer:");
        int a = sc.nextInt();

        System.out.println("please input the second integer");
        int b = sc.nextInt();

        int max = getMax(a, b);

        System.out.println("the bigger one is:" + max);
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
