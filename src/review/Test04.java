package review;
/*
    设计一个方法, 用于比较两个数组内容是否相同
 */
public class Test04 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};
        boolean flag = compareArray(arr1, arr2);
        System.out.println(flag);
    }

    public static boolean compareArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
