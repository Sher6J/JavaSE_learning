package Class;
/*
    学生测试类
 */
public class Student1Demo {
    public static void main(String[] args) {
        Student1 s = new Student1(); //系统给的无参默认构造方法

        s.setName("James");
        s.setAge(30);

        s.show();

        System.out.println(s.getName() + "---" + s.getAge());
    }
}
