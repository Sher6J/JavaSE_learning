package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    构造方法：
        public SimpleDateFormat (); 构造一个SimpleDateFormat, 使用默认模式和日期格式
        public SimpleDateFormat (Sting pattern); 构造一个SimpleDateFormat, 使用给定的模式和默认的日期格式
    格式化：从Date到String
        public final String format(Date date); 将日期格式化成日期/时间字符串
    解析：从String到Date
        public Date parse(String source); 从给定字符串的开始解析文本以产生日期
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s1 = sdf1.format(d);
        System.out.println(s1);

        //解析
        String ss = "2020-03-04 11:11:11";
        /*SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date dd = sdf2.parse(ss); //抛出异常, 模式不匹配*/
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);


    }
}
