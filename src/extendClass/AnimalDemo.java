package extendClass;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName() + "," + c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat("佳佳猫", 3);
        System.out.println(c2.getName() + "," + c2.getAge());
        c2.catchMouse();
    }
}
