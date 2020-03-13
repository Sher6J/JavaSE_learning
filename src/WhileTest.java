/*
    珠穆朗玛峰
    需求：
        珠峰8844.43m = 8844430 mm, 有足够大的纸, 厚度0.1mm, 问折叠多少次为珠峰高度
 */
public class WhileTest {
    public static void main(String[] args) {
        int count = 0;
        double paper = 0.1;
        int zf = 8844430;
        //因为要反复折叠, 所以要使用循环, 但是不知道折叠多少次, 更适合用while循环
        while (paper <= zf) {
            paper *= 2;
            count ++;
        }
        System.out.println("需要折叠：" + count + "次");
    }
}
