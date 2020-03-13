package Interface;

//public class Cat extends Jumpping { //报错,类不能继承借口, 类只能继承类
//类实现接口
public class Cat implements Jumpping {

    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}
