package String;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/*
    已知用户名和密码, 模拟实现用户登录
 */
public class StringTest01 {
    public static void main(String[] args) {
        String username = "James";
        String password = "lebron";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please input the user name:");
            String name = sc.nextLine();

            System.out.println("please input the password");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("账户被锁定, 请联系管理员");
                } else {
                    System.out.println("登录失败, 你还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
