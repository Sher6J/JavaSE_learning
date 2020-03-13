public class LoopTest {
    public static void main(String[] args) {
        for (int i = 3; i < 3; i++) {
            System.out.println("hello world");
        }
        System.out.println("---------");

        int j = 3;
        while (j <3) {
            System.out.println("hello world");
            j ++;
        }
        System.out.println("----------");

        int k = 3;
        do {
            System.out.println("hello world");
            j++;
        } while (k < 3);
        System.out.println("----------");
    }
}
