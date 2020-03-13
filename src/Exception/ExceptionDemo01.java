package Exception;
/*
    try{
        可能出现异常的代码;
    } catch(异常类名 变量名) {
        异常处理的代码;
    }
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("start");
        method();
        System.out.println("end");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("你访问的数组索引不存在");
            e.printStackTrace();
        }

    }
}
