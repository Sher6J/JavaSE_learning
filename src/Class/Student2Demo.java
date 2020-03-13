package Class;
/*
    测试类
 */
public class Student2Demo {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.show();

        Student2 s2 = new Student2("Lebron");
        s2.show();

        Student2 s3 = new Student2(30);
        s3.show();

        Student2 s4 = new Student2("lebron", 30);
        s4.show();
    }
}
