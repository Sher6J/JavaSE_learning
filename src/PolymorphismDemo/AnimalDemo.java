package PolymorphismDemo;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator op = new AnimalOperator();

        Cat c = new Cat();
        op.useAnimal(c);

        Dog d = new Dog();
        op.useAnimal(d);
    }
}
