package learnMethod;
/*
    带参数方法求最大值
 */
public class MethodTest01 {
    public static void main(String[] args) {
        getMax(19, 20);
        int a = 2;
        int b = 22;
        getMax(a, b);
    }

    public static void getMax(int a, int b) {
        int c = a > b ? a : b;
        System.out.println(c);
    }
}
