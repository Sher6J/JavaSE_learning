package InterfaceNew;

public interface MyInterface {
    void show1();

    void show2();

    public default void show3() {
        System.out.println("show3");
    }
}
