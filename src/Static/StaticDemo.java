package Static;
/*
    测试类
 */
public class StaticDemo {
    public static void main(String[] args) {
        Student.university = "jilin university";

        Student s1 = new Student();
        s1.name = "james";
        s1.age = 37;
        s1.show();

        Student s2 = new Student();
        s2.name = "lebron";
        s2.age = 18;
        s2.show();
    }
}
