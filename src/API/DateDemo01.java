package API;

import java.util.Date;

/*
    public Date(); 分配一个Date对象, 并初始化, 以便它代表它被分配的时间, 精确到毫秒
    public Date(long date); 分配一个Date对象, 并初始化为表示从标准基准时间起指定的毫秒数
 */
public class DateDemo01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1); //CST 中国时区

        long date = 1000*60*60; //60*60s->60m->1h
        Date d2 = new Date(date); //Thu Jan 01 01:00:00 1970 ->中国东8区
        System.out.println(d2); //
    }
}
