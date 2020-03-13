package review;
/*
    反转数组
 */
public class Test06 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        /*for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }*/
        reverse(arr);
        printArray(arr);
    }

    //遍历输出数组
    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println("]");
    }

    //反转数组 返回值是void即可,因为数组是引用类型,形参改变会影响实参
    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
