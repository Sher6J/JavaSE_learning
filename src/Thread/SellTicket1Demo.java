package Thread;

public class SellTicket1Demo {
    public static void main(String[] args) {

        SellTicket1 st = new SellTicket1();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口3");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}