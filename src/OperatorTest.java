/*
    三个和尚
    需求：获取三个和尚的最高身高（身高已知）
 */
public class OperatorTest {
    public static void main(String[] args){
        int h1 = 150;
        int h2 = 210;
        int h3 = 165;

        int tempH = h1 > h2 ? h1 : h2;

        int maxH = tempH > h3 ? tempH : h3;

        System.out.println("maxHeight：" + maxH);
    }
}
