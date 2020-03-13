package Exception;

import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the score:");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score); //编译时异常,必须显示处理
        } catch (ScoreException e) {
            e.printStackTrace();
        }

    }
}
