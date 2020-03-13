package Exception;
/*
    public String getMessage(); 返回此throwable的详细消息字符串
    public String toString(); 返回此可抛出异常的简短描述
    public void printStackTrace(); 把异常的错误信息输出在控制台    推荐！！！
 */
public class ExceptionDemo02 {
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
//            e.printStackTrace();
            /*java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            at Exception.ExceptionDemo02.method(ExceptionDemo02.java:17)
            at Exception.ExceptionDemo02.main(ExceptionDemo02.java:10)*/

//            System.out.println(e.getMessage());
            /*start
            Index 3 out of bounds for length 3
            end*/

//            System.out.println(e.toString());
            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        }

    }
}
