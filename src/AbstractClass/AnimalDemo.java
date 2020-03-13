package AbstractClass;

public class AnimalDemo {
    public static void main(String[] args) {
//        Animal a = new Animal(); //报错, 抽象类不能直接创建对象
        //抽象类参考多态创建对象
        Animal a = new Cat();
        a.eat();
        a.sleep();
    }
}
