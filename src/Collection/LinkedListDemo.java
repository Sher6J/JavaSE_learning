package Collection;

import java.util.LinkedList;

/*
    LinkedList集合的特有功能：
        public void addFirst(E e); 在该列表开头插入指定元素
        public void addLast(E e); 在该列表结尾插入指定元素

        public E getFirst(); 返回此列表的第一个元素
        public E getLast(); 返回此列表的最后一个元素

        public E removeFirst(); 从此列表中删除并返回第一个元素
        public E removeLast(); 从此列表中删除并返回最后一个元素
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        
        linkedList.addFirst("javase");
        linkedList.addLast("javaee");

        System.out.println(linkedList);

    }
}