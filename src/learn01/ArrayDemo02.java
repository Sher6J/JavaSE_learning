package learn01;
/*
    索引越界
        ArrayIndexOutOfBoundsException

    空指针异常
        NullPointerException
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        //System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
        arr = null;
        //System.out.println(arr[0]); //NullPointerException
    }
}
