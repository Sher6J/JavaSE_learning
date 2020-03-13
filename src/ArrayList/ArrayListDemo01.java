package ArrayList;

import java.util.ArrayList;

/*
    ArrayList构造方法：
        public ArrayList ();
    ArrayList添加方法：
        public boolean add(E e);　将指定元素追加到集合末尾
        public void add(int index, E element); 在此集合中的指定位置插入指定的元素
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        System.out.println("array: " + array);

//        System.out.println(array.add("hello")); //true
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println("array: " + array);

        array.add(1, "james");
        System.out.println("array: " + array);
    }
}
