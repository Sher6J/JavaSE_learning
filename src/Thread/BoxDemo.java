package Thread;
/*
    生产者消费者案例中包含的类：
        1. 奶箱类(Box)：定义一个成员变量, 表示第x瓶奶, 提供存储牛奶和获取牛奶的操作
        2. 生产者类(Producer)：实现Runnable接口, 重写run()方法, 调用存储牛奶的操作
        3. 消费者类(Customer)：实现Runnable接口, 重写run()方法, 调用获取牛奶的操作
        4. 测试类(BoxDemo)：
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();

        Producer p = new Producer(b);

        Customer c = new Customer(b);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
