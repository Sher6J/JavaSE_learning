package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
    ListIterator：列表迭代器 extends Iterator
        通过List集合的listIterator()方法得到, 是List集合特有的迭代器
        用于允许沿任一方向遍历列表的列表的迭代器, 在迭代期间修改列表, 并获取列表中迭代器的当前位置

    ListIterator中常用方法：
        E next(); 返回迭代中的下一个元素
        boolean hasNext(); 如果迭代具有更多元素, 返回true
        E previous(); 返回列表中的上一个元素
        boolean hasPrevious();
        void add (E e); 将指定的元素插入列表
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        /*ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("---------");
        while (lit.hasPrevious()) {
            String previous = lit.previous();
            System.out.println(previous);
        }*/

        //获取列表迭代器
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            if (s.equals("world")){
                lit.add("javaee"); //解决并发修改异常
            }
        }

        System.out.println(list);
    }
}
