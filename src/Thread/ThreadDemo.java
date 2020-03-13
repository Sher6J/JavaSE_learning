package Thread;

import java.util.*;

/*
    线程安全的类：
        StringBuffer
        Vector
        Hashtable
 */
public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> s1 = new Vector<>();
        ArrayList<String> s2 = new ArrayList<>();

        Hashtable<String, String> m1 = new Hashtable<>();
        HashMap<String, String> m2 = new HashMap<>();

        //static <T> List<T> synchronizedList​(List<T> list) 返回由指定列表支持的同步（线程安全）列表
        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        //static <K,​V> Map<K,​V>	synchronizedMap​(Map<K,​V> m) 返回由指定映射支持的同步（线程安全）映射
        Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
    }
}
