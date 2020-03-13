package ArrayList;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Scanner;

/*
    创建存储字符串的集合, 存储３个字符串元素, 遍历该集合
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        /*Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();

        Student s = new Student(name, age);

        array.add(s);*/

        addStudent(array);
        addStudent(array);
        addStudent(array);

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();

        Student s = new Student(name, age);

        array.add(s);
    }

}
