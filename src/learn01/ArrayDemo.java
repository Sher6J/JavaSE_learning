package learn01;
/*
    数组定义格式(推荐方式)：
        数据类型[] 数组名；
        int[] arr;
    数组初始化：
        动态初始化, 静态初始化
    动态初始化： 初始化只指定数组长度, 由系统为数组分配初始值
        格式： 数据类型[] 变量名 = new 数据类型[数组长度];
        范例： int[] arr = new int[3];
 */

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];

        //输出数组名
        System.out.println(arr); // [I@2ff4f00f

        //输出元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 100;
        arr[2] = 200;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
