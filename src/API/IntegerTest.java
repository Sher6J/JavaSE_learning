package API;

import java.util.Arrays;

/*
    需求：
        有一个字符串："91 27 46 38 50", 实现最终输出结果为："27 38 46 50 91"
 */
public class IntegerTest {
    public static void main(String[] args) {
        String s ="91 27 46 38 50";
        String[] strArray = s.split(" ");
        /*for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }*/

        //把String[]数组中元素存储到int数组中
        int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        /*for (int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }
        String res = sb.toString();

        System.out.println(res);
    }
}
