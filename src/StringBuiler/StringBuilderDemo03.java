package StringBuiler;
/*
    StringBuilder转换为String
        public String toString();　通过String类的成员函数即可
    String转换为StringBuilder
        public StringBuilder(String s);　通过StringBuilder的构造方法即可
 */
public class StringBuilderDemo03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("james");

        String s = sb.toString();
        System.out.println(s);

        String s1 = "hello";

        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(sb1);
    }
}
