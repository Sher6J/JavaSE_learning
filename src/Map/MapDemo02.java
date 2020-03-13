package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的基本功能：
        V put(K key, V value); 添加元素
        V remove(Object key); 根据键删除键值对元素
        void clear(); 移除所有的键值对元素
        boolean containsKey(Object key);
        boolean containsValue(Object value);
        boolean isEmpty();
        int size(); 集合的长度, 即集合中键值对个数
    Map集合的获取功能：
        V get(Object key); 根据键获取值
        Set<K> keySet(); 获取所有键的集合
        Collection<V> values(); 获取所有值的集合
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("刘佳轩", "赵天横");

        System.out.println(map);

        System.out.println(map.remove("杨过"));
        System.out.println(map.remove("郭襄"));

        System.out.println(map.size());

        System.out.println(map.get("张无忌"));

        Set<String> key = map.keySet();
        for (String s : key) {
            System.out.println(s);
        }

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }


    }
}
