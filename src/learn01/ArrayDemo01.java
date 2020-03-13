package learn01;
/*
    静态初始化：初始化指定每个数组元素的初始值, 由系统决定数组长度
        格式： 数据类型[] 变量名 = new 数据类型[]{数据1, 数据2, 数据3, ……};
        范例： int[] arr = new int[]{1, 2, 3};
        简化格式（推荐）： 数据类型[] 变量名 = {数据1, 数据2, 数据3, ……};
        范例： int[] arr = {1, 2, 3};
 */

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] arr  = {1, 2, 3};

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
