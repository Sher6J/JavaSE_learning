package extendClass;

public class Teacher extends Person {
    public Teacher() {}
    public Teacher(String name, int age) {
        super(name, age);
    }
    public void teacher() {
        System.out.println("教书做人");
    }
}
