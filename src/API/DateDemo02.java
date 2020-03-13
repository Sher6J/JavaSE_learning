package API;

import java.util.Date;

/*
    public long getTime(); 获取日期对象从1970年1月1日00:00:00到现在的毫秒数
    public long setTime(long time); 设置时间, 给定毫秒数
 */
public class DateDemo02 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());

        long times  = System.currentTimeMillis();
        d.setTime(times);
        System.out.println(d);
    }
}
