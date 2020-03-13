package learn01;
/*
   遍历数组
   获取数组元素个数（数组长度）：数组名.length
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
