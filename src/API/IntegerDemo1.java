package API;
/*
    int和String的相互转换
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        int number = 100;
        //方式1
        String s1 = "" + number;
        System.out.println(s1);

        //方式2
        //public static String valueOf (int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("--------");

        String s = "100";
        //方式1  String->Integer->int
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);

        //方式2
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}
