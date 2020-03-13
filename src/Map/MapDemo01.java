package Map;

import java.util.HashMap;
import java.util.Map;

/*
    Map集合概述
        Interface Map<K, V> K:键的类型;V:值的类型
        将键映射到值的对象
    创建Map集合的对象
        多态的方式
        具体的实现类HashMap
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("001", "james");
        map.put("002", "lebron");
        map.put("003", "harden");

        System.out.println(map);
    }
}
