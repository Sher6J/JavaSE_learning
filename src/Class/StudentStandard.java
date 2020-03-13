package Class;
/*
    标准类：
        成员变量：使用private修饰
        构造方法：
            提供一个无参构造方法
            提供一个带多个参数的构造方法
        成员方法：
            提供每一个成员变量的setXxx()/getXxx()
            提供一个显示对象信息的show()
 */
public class StudentStandard {
    private String name;
    private int age;

    public StudentStandard() {
    }

    public StudentStandard(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
