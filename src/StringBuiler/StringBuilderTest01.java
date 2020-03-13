package StringBuiler;
/*
    定义一个方法, 把int数组中的数据按照指定格式拼接成一个字符串返回, 调用该方法并输出结果
    例如, 数组为 int[] arr = {1, 3, 4, 5}; 输出为[1, 3, 4, 5]
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        String s = arrToString(arr);
        System.out.println(s);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < arr.length; i ++) {
            if (i == arr.length-1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
