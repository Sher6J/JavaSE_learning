package Outer;
/*
    测试类
    成员内部类, 外界如何创建对象使用：
        格式： 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
        范例： Outer.Inner oi = new Outer().new Inner();
 */
public class InnerDemo {
    public static void main(String[] args) {
//        Inner i = new Inner(); //报错

        /*Outer.Inner oi = new Outer().new Inner();//针对public内部类, 私有内部类则报错
        oi.show();*/

        Outer o = new Outer();
        o.method();
        System.out.println("-------");

        Outer o1 = new Outer();
        o1.method1();

    }
}
