package Class;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();

        //p是new出来的, new出来的东西在堆内存,　有初始值, String->null, int->0
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println("---------");

        p.brand = "Huawei";
        p.price = 4999;
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println("---------");

        p.call();
        p.sendMessage();
    }
}
