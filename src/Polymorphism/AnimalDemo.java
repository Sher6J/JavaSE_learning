package Polymorphism;
/*
    多态：
        同一个对象,　在不同时刻表现出来的不同形态
    举例：
        我们可以说猫是猫, 猫 cat = new 猫();
        我们也可以说是猫是动物, 动物 animal = new 猫();
    多态的前提和体现：
        有继承/实现关系
        有方法重写
        有父类引用指向子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //父类引用指向子类对象
        Animal s = new Cat();

        //多态访问成员变量, 编译看左边, 运行看左边
        System.out.println(s.age); //40
//        System.out.println(s.weight); //报错, s里没有weight

        //多态访问成员方法, 编译看左边, 运行看右边
        s.eat(); //猫吃鱼
//        s.playGame(); //报错, s里没有playGame();

        //因为成员方法有重写, 成员变量没有
    }

}
