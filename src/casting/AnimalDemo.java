package casting;
/*
    向上转型
        从子到父
        父类引用指向子类对象
    向下转型:解决多态弊端, 使左边可以使用右边特有功能
        从父到子
        父类引用转为子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //多态
        Animal a = new Cat(); //向上转型
        a.eat();
//        a.playGame(); //报错,编译看左边

        Cat c = (Cat)a; //向下转型
        c.eat();
        c.playGame();


    }
}
