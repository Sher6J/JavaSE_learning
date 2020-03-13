package extendClass;
/*
    测试类
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("james");
        System.out.println("--------");
        NewPhone np = new NewPhone();
        np.call("james");

    }
}
