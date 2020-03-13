package AbstractClass;
/*
    子类除非本身是一个抽象类, 否则必须重写继承的抽象类中的所有抽象方法
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
