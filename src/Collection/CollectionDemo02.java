package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    Collection集合常用方法：
        boolean add(E e); 添加元素
        boolean remove(Object o); 从集合中移除指定的元素
        void clear(); 清空集合中所有元素
        boolean contains(Object o); 判断集合中是否存在指定元素
        boolean isEmpty(); 判断集合是否为空
        int size (); 集合的长度, 也就是集合中元素个数

    Alt+7  打开一个窗口, 能够查看类的所有信息
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        /*//c.add返回永远是true
        System.out.println(c.add("Hello"));
        System.out.println(c.add("world"));
        System.out.println(c.add("world"));*/
        c.add("hello");
        c.add("world");
        c.add("world");

        System.out.println(c.remove("hello"));
        System.out.println(c.remove("javaee"));
        System.out.println(c.remove("world"));

        System.out.println(c.contains("world"));
        System.out.println(c.contains("hello"));

        System.out.println(c.isEmpty());
        System.out.println(c.size());

        System.out.println(c);
    }
}
