package Class;

import java.util.StringJoiner;

/*
    学生类

    构造方法：
        作用： 创建对象
        功能： 完成对象数据的初始化

    格式：
        修饰符 类名(参数) {

        }
        修饰符一般用public
 */
public class Student2 {
    private String name;
    private int age;

    //构造方法
    public Student2() {
        System.out.println("无参构造方法");
    }

    public Student2(String name) {
        this.name = name;
    }

    public Student2(int age) {
        this.age = age;
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
