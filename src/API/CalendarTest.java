package API;

import java.util.Calendar;
import java.util.Scanner;

/*
    需求
        获取任意一年的二月有多少天
    思路
        1. 键盘录入任意的年份
        2. 设置日历对象的年、月、日
            年：来自键盘录入
            月：设置为3月, 月份从0开始, 所以设置值为2
            日：设置为1日
        3. 3月1日往前推一天, 就是2月的最后一天
        4. 获取这一天输出即可
 */
public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        c.add(Calendar.DATE, -1);
        int date = c.get(Calendar.DATE);

        System.out.println("这一年的二月份有" + date + "天");
    }
}
