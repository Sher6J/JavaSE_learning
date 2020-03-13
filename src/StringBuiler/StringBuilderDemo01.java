package StringBuiler;
/*
    String与StringBuilder区别：String不可变, StringBuilder可变

    StringBuilder构造方法：
        public StringBuilder();
        public StringBuilder(String str);
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());

        StringBuilder sb2 = new StringBuilder("james");
        System.out.println("sb:" + sb2);
        System.out.println("sb.length():" + sb2.length());
    }
}
