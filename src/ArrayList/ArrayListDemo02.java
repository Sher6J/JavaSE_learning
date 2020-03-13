package ArrayList;

import java.util.ArrayList;

/*
    ArrayList常用方法：
        public boolean remove(Object o);  删除指定元素, 返回删除是否成功
        public E remove(int index);　　删除指定索引处的元素, 返回被删除的元素
        public E set(int index, E element);  修改指定索引处的元素, 返回被修改的元素
        public E get(int index);  返回指定索引处的元素
        public int size();  返回集合中的元素个数
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("james");
        array.add("lebron");

        System.out.println("array: " + array);

        System.out.println("array1: " + array.remove("world"));
        System.out.println("array1: " + array);

        System.out.println("array1: " + array.remove("javaee"));
        System.out.println("array1: " + array);

        System.out.println("array2: " + array.remove(1));
        System.out.println("array2: " + array);

        System.out.println("array3: " + array.set(1, "ccc"));
        System.out.println("array3:"  + array);

        System.out.println(array.size());
    }

}
