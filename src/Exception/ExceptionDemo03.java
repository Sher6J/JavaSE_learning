package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Java中的异常被分为两大类, 编译时异常（受检异常）和运行时异常（非受检异常）
    所有的RuntimeException类及其子类的实例被称为运行时异常, 其他的异常都是编译时异常

    编译时异常：必须显示处理, 否则程序就会发生错误, 无法通过编译
    运行时异常：无需显示处理, 也可以和编译时异常一样处理

    throws 异常类名;
    这个格式是跟在方法的括号后面的
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("start");
        method();
//        method2();
        System.out.println("end");
    }

    public static void method2() {
        try {
            String s = "2046-03-05";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);  //ParseException, 编译时异常,必须显示处理！
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    //运行时异常
    public static void method() throws ArrayIndexOutOfBoundsException{
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
    }
}
