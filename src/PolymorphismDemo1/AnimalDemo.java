package PolymorphismDemo1;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());

        a = new Cat("加肥", 5);
        System.out.println(a.getName() + "," + a.getAge());
    }
}
