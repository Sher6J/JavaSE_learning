package learnMethod;

import java.security.spec.RSAOtherPrimeInfo;

/*
    对于基本数据类型的参数, 形式参数的改变, 不影响实际参数的值
    对于引用类型的参数, 形式参数的改变, 影响实际参数的值
 */
public class MethodDemo05 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("before method:" + num);
        change(num);
        System.out.println("after method:" + num);

        System.out.println("----------------------");

        int[] arr = {10, 20, 30};
        System.out.println("before method:" + arr[1]);
        change(arr);
        System.out.println("after method:" + arr[1]);
    }

    public static void change(int num) {

        num = 10;
    }
    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
