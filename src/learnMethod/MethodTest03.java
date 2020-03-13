package learnMethod;
/*
    数组遍历：设计一个方法用于数组遍历, 要求结果在一行上

    System.out.println("内容"); 输出内容并换行
    System.out.print("内容"); 输出内容不换行
    System.out.println(); 起到换行的作用
 */
public class MethodTest03 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1){
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }
        System.out.println("]");
    }
}
