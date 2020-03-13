package Collections;

import Collection.TreeSetStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
    需求：
        实现斗地主过程中的洗牌, 发牌和看牌. 要求：对牌进行排序
    思路：
        1. 创建HashMap, 键是编号, 值是牌
        2. 创建ArrayList, 存储编号
        3. 创建花色数组和点数数组
        4. 从0开始往HashMap里存储编号, 并存储相对应的牌, 同时往ArrayList里存储编号
        5. 洗牌（洗的是编号）, 用Collections的shuffle()方法实现
        6. 发牌（发的也是编号, 为了保证编号是排序的, 创建TreeSet集合接受）
        7. 定义方法看牌（遍历TreeSet集合, 获取编号, 到HashMap集合中找对应的牌）
        8. 调用方法看牌
 */
public class PokerDemo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        ArrayList<Integer> array = new ArrayList<>();

        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        //定义点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 0;

        //存牌
        for (String numer: numbers) {
            for (String color : colors) {
                map.put(index, color + numer);
                array.add(index);
                index ++;
            }
        }

        map.put(index, "小王");
        array.add(index);
        index ++;
        map.put(index, "大王");
        array.add(index);

        Collections.shuffle(array); //洗牌

        //发牌
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();

        for (int i = 0; i < array.size(); i++) {
            int poker = array.get(i);
            if (i >= array.size() - 3) {
                dipai.add(array.get(poker));
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else if (i % 3 == 2) {
                player3.add(poker);
            }
        }

        look("玩家1：", player1, map);
        look("玩家2：", player2, map);
        look("玩家3：", player3, map);
        look("底牌：", dipai, map);
    }

    //定义方法看牌
    public static void look(String name, TreeSet<Integer> ts, HashMap<Integer, String> map) {
        System.out.print(name + "的牌是：");
        for (Integer key : ts) {
            String poker = map.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
