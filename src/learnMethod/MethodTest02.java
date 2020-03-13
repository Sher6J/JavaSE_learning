package learnMethod;
/*
    带返回值方法得到较大值
 */
public class MethodTest02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(getMax(a, b));

        int result = getMax(a, b);
        System.out.println(result);
    }
    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

}
