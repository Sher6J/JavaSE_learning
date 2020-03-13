/*
    短路逻辑云算法
 */
/*
    逻辑与&, 无论左边真假, 右边都要执行
    短路与&&, 如果左边为真, 右边执行; 如果左边为假, 右边不执行
    逻辑或|, 无论左边真假, 右边都要执行
    短路或||, 如果左边为假, 右边执行; 如果左边为真, 右边不执行
 */
public class OperatorDemo05 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 30;

        //&&
        System.out.println((i > j) && (i > k)); //false && false
        System.out.println((i < j) && (i > k)); //true && false
        System.out.println((i > j) && (i < k)); //false && true
        System.out.println((i < j) && (i < k)); // true && true
        System.out.println("-----------");

        //||
        System.out.println((i > j) || (i > k)); //false || false
        System.out.println((i < j) || (i > k)); //true || false
        System.out.println((i > j) || (i < k)); //false || true
        System.out.println((i < j) || (i < k)); // true || true
        System.out.println("-----------");

        //&& 和 &
        System.out.println((i++ > 100) & (j++ > 100)); //false & false
        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("-----------");
        i--; j--;
        System.out.println((i++ > 100) && (j++ > 100)); //false && false
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
