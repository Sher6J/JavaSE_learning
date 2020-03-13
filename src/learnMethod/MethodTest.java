package learnMethod;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

/*
    设计一个方法打印两个数中较大数
 */
public class MethodTest {
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax() {
        int a = 10;
        int b = 20;
        int c = a > b ? a : b;
        System.out.println(c);
    }
}
