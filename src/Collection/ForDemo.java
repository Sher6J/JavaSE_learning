package Collection;

import java.util.ArrayList;
import java.util.List;

/*
    增强for：简化数组和Collection集合的遍历
        实现Iterable接口的类允许其对象成为增强型for语句的目标
        它是JDK5之后出现的, 内部原理是一个Iterator迭代器
    格式：
        for(元素数据类型 变量名: 数组或Collection集合) {
            //在此处使用变量即可, 该变量就是元素
        }
 */
public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("--------");

        String[] strArray = {"hello", "world", "java"};
        /*for (int i : strArray) { //报错 Required type ： String
            System.out.println(i);
        }*/
        for (String i : strArray) {
            System.out.println(i);
        }
        System.out.println("-------");

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("james");
        list.add("java");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------");

        //验证内部是个迭代器
        /*for (String s : list) {
            if (s.equals("hello")) {
                list.add("javaee");  //ConcurrentModificationException,并发修改异常
            }
            System.out.println(s);
        }*/

    }
}
