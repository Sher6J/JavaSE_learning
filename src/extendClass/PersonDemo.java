package extendClass;
/*
    测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("james");
        t1.setAge(20);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teacher();

        Teacher t2 = new Teacher("lebreon", 20);
        System.out.println(t2.getName() + "," + t2.getAge());
    }
}
