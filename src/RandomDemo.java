/*
    Random
    作用：用于产生一个随机数
    使用步骤：
        1. 导包
            import java.util.Random;
        2. 创建对象
            Random r = new Random();
        3. 获取随机数
            int num = r.nextInt(10); //数据范围[0,), 包括0, 不包括10

 */
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(10);
            System.out.println(num);

        }
    }
}
