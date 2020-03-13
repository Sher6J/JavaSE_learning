public class ConvresionDemo {
    public static void main(String[] args){
        //自动类型转换
        double d = 10;
        System.out.println(d);

        byte b = 10;
        short s = b;
        int i = b;

        //类型不兼容
        //char = b;

        //强制类型转换,不建议用,会有数据丢失
        //int k = 88.88
        int k = (int)88.88;
        System.out.println(k);
    }
}
