package String;
/*
    String类是不可变的

    使用＝＝作比较：
        基本类型：比较的是数据值是否相同
        引用类型：比较的是地址值是否相同

    字符串是类, 是引用类型

    String构造方法：
        public String();  创建一个空白字符串对象, 不含有任何内容
        public String(char[] chs);  根据字符数组的内容,　来创建字符串对象
        public String(byte[] bys);  根据字符数组的内容,　来创建字符串对象
        String s = "abc";　　直接赋值的方法创建字符串对象, 内容就是"abc"

        推荐使用直接赋值的方式得到字符串对象
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1:" + s1);

        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        byte[] bys = {1, 3, 5};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        byte[] bys2 = {97, 98, 99};
        String s4 = new String(bys2);
        System.out.println("s4:" + s4);

        String s5 = "abc";
        System.out.println("s5：" + s5);
    }
}
