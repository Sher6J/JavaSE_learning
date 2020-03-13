package StringBuiler;
/*
    StringBuilder　的添加和反转
        public StringBuilder append(任意类型);
        public StringBuilder reverse();
 */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        /*StringBuilder sb2 = sb.append("hello"); //添加数据, 并返回对象本身

        System.out.println("sb:" + sb); //hello
        System.out.println("sb2:" + sb2); //hello
        System.out.println(sb == sb2); //true*/

        /*sb.append("hello");
        sb.append("java");
        sb.append("world");
        sb.append(1010);*/
        //链式编程
        sb.append("hello").append("java").append("world").append(1010);

        System.out.println("sb:" + sb);

        sb.reverse();

        System.out.println("sb:" + sb);

    }
}
