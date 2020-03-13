public class OperatorDemo {
    public static void main(String[] args){
        int i = 10;
        System.out.println("i:" + i);

        // +=
        i += 20;
        // i = i + 20;
        System.out.println("i:" + i);

        //注意：扩展的赋值运算符底层隐含了强制类型转换
        short s = 10;
        s += 20;
        System.out.println("s:" + s);
        short s1 = 10;
        //s = s + 20; 报错
        s1 = (short)(s + 20);
        System.out.println(s1);

    }
}
