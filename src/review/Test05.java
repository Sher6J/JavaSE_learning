package review;

import java.util.Scanner;

/*
    已知一个数组, 键盘录入一个数据, 查找该数据在数组中的索引, 并输出索引值
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        Scanner sc = new Scanner(System.in);

        System.out.println("please input the data to search:");
        int num = sc.nextInt();

        /*int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }*/
        int index = getIndex(arr, num);

        System.out.println("index:" + index);
    }

    //查找指定数据在数组中索引
    public static int getIndex(int[] arr, int num) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }
}
