package Class;
/*
    学生类
    成员变量和局部变量：
        成员变量：类中成员方法外的变量或类声明时的变量
        局部变量：类中成员方法中的变量
    this修饰的变量用于指代成员变量 -> 解决局部变量隐藏成员变量
    方法的形参若与成员变量同名, 不带this修饰的变量指的是形参, 而不是成员变量
 */
public class Student1 {
    //成员变量
    private String name;
    private int age;

    //get/set方法
    /*public void setName(String n) {
        name = n;
    }*/
    public void setName(String name) {
        //name = name; //赋值失败, 编译器都当做为形参name,即局部变量
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*public void setAge(int a) {
        if (a < 0 || a > 120) {
            System.out.println("你给的年龄有误！");
        } else {
            age = a;
        }
    }*/
    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("你给的年龄有误！");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
