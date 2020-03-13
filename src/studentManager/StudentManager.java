package studentManager;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        while (true) {

            System.out.println("----------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //switch（）中为字符串在JDK7后是可以的
            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
//
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0); //JVM退出
            }
        }
    }

    //定义方法用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学号：");
        String sid = sc.nextLine();

        System.out.println("请输入姓名：");
        String name = sc.nextLine();

        System.out.println("请输入年龄：");
        String age = sc.nextLine();

        System.out.println("请输入居住地：");
        String address = sc.nextLine();

        Student s = new Student(sid, name, age, address);

        array.add(s);

        System.out.println("添加学生成功");
    }

    //定义方法用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("没有信息,请先添加信息再查看");
            return;
        }

        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地"); //\t相当于tab键

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }

    //定义方法用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除学生的学号：");
        String sid = sc.nextLine();

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("该信息不存在, 请重新输入");
        } else {
            array.remove(index);
            System.out.println("删除学生成功");
        }


        System.out.println("删除成功");
    }

    //定义方法用于修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要修改信息的学生学号");
        String sid = sc.nextLine();

        System.out.println("请输入学生新姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地");
        String address = sc.nextLine();

        Student s = new Student(sid, name, age, address);

        for (int i = 0; i< array.size();i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
                array.set(i, s);
                break;
            }

        }
        System.out.println("修改学生成功");
    }
}
