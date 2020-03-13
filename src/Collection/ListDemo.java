package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
    List集合常用子类：ArrayList, LinkedList
        ArrayList：底层数据结构是数组, 查询快, 增删慢
        LinkedList：底层数据结构是链表, 查询慢, 增删快

    练习：
        分别使用ArrayList和LinkedList完成存储字符串并遍历
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历1
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("--------");
        //遍历2
        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("--------");
        //遍历3
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        System.out.println("--------");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
