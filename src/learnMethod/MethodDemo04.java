package learnMethod;
/*
    方法重载：
        多个方法在同一个类中
        多个方法具有相同的方法名
        多个方法的参数不相同, 类型不同或者数量不同
 */
public class MethodDemo04 {
    public static void main(String[] args) {
        int res1 = sum(10, 20);
        System.out.println(res1);

        double res2 = sum(20.0, 10.0);
        System.out.println(res2);

        double res3 = sum(10, 20, 30);
        System.out.println(res3);


    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(int a, int b, int c) {
        return a + b + c;
    }
}
