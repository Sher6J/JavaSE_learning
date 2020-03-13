package Polymorphism;

//继承/实现关系
public class Cat extends Animal{

    public int age = 20;
    public int weight = 10;

    @Override//有方法重写
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫捉迷藏");
    }
}
