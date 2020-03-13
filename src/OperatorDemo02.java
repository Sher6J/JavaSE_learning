public class OperatorDemo02 {
    public static void main(String[] args){
        int i = 10;
        char c = 'A'; //'A'的值是65
        c = 'a'; //'a'的值是97
        c = '0'; //'0'的值是48
        System.out.println(i + c);

        /*
        算术表达式包含多个基本类型时,整个算术表达式类型会自动提升
        提升规则：
            byte,short,char将被提升为int
            等级顺序：byte, short, char -> int -> long -> float -> double
         */
        //char ch = i + c; //报错,char类型自动提升为int
        int j = i + c;
        System.out.println(j);

    }
}
