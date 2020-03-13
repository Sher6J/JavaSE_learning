/*
    变量使用注意：
        名字不能重复
        未赋值,不能使用
        long类型变量定义时,为防止整数过大,后面要加L
        float类型变量定义时,为防止类型不兼容,后面要加f
 */
public class VariableDemo02 {
    public static void main(String[] args){
        byte b = 10;
        System.out.println(b);

        short a = 100;
        System.out.println(a);

        int i = 10000;
        System.out.println(i);

        double d = 3.14;
        System.out.println(d);

        char c = 'a';
        System.out.println(c);

        //在main范围内变量定义名不能重复
        //boolean b = true;
        //System.out.println(b);
        boolean bb = true;
        System.out.println(bb);

        //报错,默认为int
        //long l = 100000000000;
        //System.out.println(l);
        long l = 100000000000L;
        System.out.println(l);

        //报错,默认为double
        //float f = 3.14;
        //System.out.println(f);
        float f = 3.14f;
        System.out.println(f);
    }
}
