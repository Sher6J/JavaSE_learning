package review;
/*
    不死神兔：
        有一对兔子, 从出生后第3个月起每个月都生一对兔子, 小兔子长到第3个月后又生出一对兔子,
        假如兔子都不死, 问第二十个月的兔子对数为多少？ -> 斐波那契数列
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        System.out.println("第20个月兔子对数为：" + arr[19]);
    }
}
