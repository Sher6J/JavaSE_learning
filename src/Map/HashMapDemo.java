package Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
    需求：
        键盘录入一个字符串, 要求统计字符串中每个字符串出现的次数
        举例：键盘录入"aababcabcdabcde" 在控制台输出："a(5)b(4)c(3)d(2)e(1)"
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String s = sc.nextLine();

//        HashMap<Character, Integer> map = new HashMap<>(); //HashMap没有排序
        TreeMap<Character, Integer> map = new TreeMap<>(); //TreeMap对键进行排序
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = map.get(c);
            if (val == null) {
                map.put(c, 1);
            } else {
                val++;
                map.put(c, val);
            }
        }

        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = map.keySet();
        for (Character c : keySet) {
            Integer val = map.get(c);
            sb.append(c).append("(").append(val).append(")");
        }

        System.out.println(sb.toString());
    }
}
