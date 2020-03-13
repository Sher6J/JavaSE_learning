package InterfaceDemo;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();
        System.out.println("---------");

        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
//        a.jump();//报错,Animal中没有jump方法

        //使用具体的子类（实现类）
        Cat c = new Cat();
        c.setName("加非");
        c.setAge(4);
        System.out.println(c.getName() + "," +c.getAge());
        c.eat();
        c.jump();


    }
}
