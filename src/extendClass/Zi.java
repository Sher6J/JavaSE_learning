package extendClass;

public class Zi extends Fu{
    public int height = 175;
    public int age = 30;

    public void method() {
        System.out.println("method方法被调用");
    }

    public void show1() {
        int age = 20;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);

        System.out.println(height);
    }
}
