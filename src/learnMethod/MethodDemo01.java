package learnMethod;
/*
    带参数方法的定义和调用
    定义格式：
        public static void 方法名(参数) {……}
    调用格式：
        方法名(参数);
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        isEvenNumber(10);
        int num = 10;
        isEvenNumber(num);
    }

    public static void isEvenNumber(int num) {
        if (num % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
