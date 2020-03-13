package Collection;

import java.util.ArrayList;
import java.util.List;

/*
    List集合特有方法：
        void add(int index, E element); 在此集合中的指定位置插入制定的元素
        E remove(int index); 删除指定索引处的元素, 返回被删除的元素
        E set(int index, E element); 修改指定索引处的元素, 返回被修改的元素
        E get(int index); 返回指定索引处的元素
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        list.add(1, "javaee");

        list.remove(1);

        System.out.println(list.set(1, "james"));

        System.out.println(list);

        System.out.println(list.get(2));

        //遍历可以用迭代器, 因为List接口继承自Collection接口

        //特有遍历方法
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
