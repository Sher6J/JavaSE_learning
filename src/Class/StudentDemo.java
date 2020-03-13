package Class;
/*
    学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "James";
        //s.age = -36;
        //s.setAge(-30); //你给的年龄有误
        s.setAge(30);

        s.show();
    }
}
