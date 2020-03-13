package API;

import AnonymousInnerClass.Inter;

/*
    构造方法：
        public Integer(int value); 根据int值创建Integer对象（过时）
        public Integer(String s); 根据String值创建Integer对象（过时）

    静态方法获取对象：
        public static Integer valueOf (int i); 返回表示指定的int值的Integer实例
        public static Integer valueOf (String i); 返回表示指定的String值的Integer实例
 */
public class IntegerDemo {
    public static void main(String[] args) {
        /*Integer i1 = new Integer(100);
        System.out.println(i1);*/

        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        Integer i2 = Integer.valueOf("13445");
        System.out.println(i2);

    }
}
