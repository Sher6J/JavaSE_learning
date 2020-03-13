package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    需求：
        实现斗地主过程中的洗牌, 发牌和看牌
    思路：
        1. 创建牌盒, 即定义一个集合对象, 用ArrayList集合实心
        2. 往牌盒里面装牌
        3. 洗牌, 即把牌打散, 用Collections的shuffle()方法
        4. 发牌, 即遍历集合, 给三个玩家发牌
        5. 看牌, 三个玩家分别遍历自己的牌
 */
public class PokerDemo {
    public static void main(String[] args) {
        //创建牌盒
        ArrayList<String> array = new ArrayList<>();

        //往牌盒里装牌
        /*
            ♦2,♦3,……
            ♣2,……
            ♥2,……
            ♠2,……
            小王, 大王
         */
        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");

        Collections.shuffle(array); //洗牌

        /*System.out.println("牌盒中的牌：" + array);
        System.out.println("牌的个数为：" + array.size());*/

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //发牌
        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                dipai.add(poker);
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else if (i % 3 == 2) {
                player3.add(poker);
            }
        }

        //看牌
        look("玩家1", player1);
        look("玩家2", player2);
        look("玩家3", player3);
        look("底牌", dipai);
    }

    //看牌方法
    public static void look(String name, ArrayList<String> array) {
        System.out.print(name + "的牌是：");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
