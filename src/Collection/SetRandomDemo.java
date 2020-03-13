package Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
    编写程序, 获取10个1-20间随机数, 要求随机数不能重复
 */
public class SetRandomDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
//        Set<Integer> set = new TreeSet<>();//最终集合会排序

        Random r = new Random();

        while (set.size() < 10) {
            int i = r.nextInt(20) + 1;
            set.add(i);
        }

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
