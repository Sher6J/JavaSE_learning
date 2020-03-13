package review;
/*
    百钱百鸡：鸡翁一值钱五, 鸡母一值钱三, 鸡雏三值钱一。百钱买百鸡, 鸡翁, 鸡母, 鸡雏各几何？
 */
public class Test03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                int z = 100 - i - j;
                if (z % 3 == 0 && 5 * i + 3 * j + z / 3 == 100) {
                    System.out.println(i + "," + j + "," + z);
                }
            }
        }
    }
}
