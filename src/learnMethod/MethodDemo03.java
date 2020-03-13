package learnMethod;
/*
    方法注意事项：
        方法不能嵌套定义
        void表示无返回值, 可以省略return, 也可以单独书写return, 后面不加数据
 */
public class MethodDemo03 {
    public static void main(String[] args) {

    }

    public static void methodOne() {

    }

    public static void methodTwo() {
        //return 100; //报错
        return;

        //System.out.println("hello"); //报错：Unreachable statement
    }
}
