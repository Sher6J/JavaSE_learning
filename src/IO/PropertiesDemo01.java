package IO;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为Map集合的使用
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();

        prop.put("001", "james");
        prop.put("002", "harden");
        prop.put("003", "curry");

        Set<Object> keySet = prop.keySet();
        for (Object key: keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }
    }
}
