package Class;
/*
    标准测试类：
        创建对象并为其成员变量赋值的两种方法：
            1. 无参构造方法创建对象后使用setXxx()赋值
            2. 使用带参构造方法直接创建带有属性值的对象
 */
public class StudentStandardDemo {
    public static void main(String[] args) {
        //1.
        StudentStandard s1 = new StudentStandard();
        s1.setName("James");
        s1.setAge(30);
        s1.show();
        //2.
        StudentStandard s2 = new StudentStandard("James" , 30);
        s2.show();
    }
}
