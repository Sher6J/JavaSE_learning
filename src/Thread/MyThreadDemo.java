package Thread;
/*
    方式1：继承Thread类
        1. 定义一个类继承Thread类
        2. 在类中重写run()方法
        3. 创建类对象
        4. 启动线程

    Thread类中获取和设置线程名称的方法
        void setName(String name);
        String getName();

    Thread类中设置和获取线程优先级的方法
        public final void setPriority(int newPriority);
        public final int getPriority;
 */
public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread m1 = new MyThread();
//        MyThread m2 = new MyThread();

//        m1.run();
//        m2.run();

//        m1.setName("高铁");
//        m2.setName("飞机");

        MyThread m1 = new MyThread("高铁");
        MyThread m2 = new MyThread("飞机");
        MyThread m3 = new MyThread("汽车");

        /*//线程默认优先级5
        System.out.println(m1.getPriority());  //5
        System.out.println(m2.getPriority());  //5
        System.out.println(m3.getPriority());  //5*/

        /*System.out.println(Thread.MAX_PRIORITY);  //10
        System.out.println(Thread.MIN_PRIORITY);  //1
        System.out.println(Thread.NORM_PRIORITY);  //5*/

        m1.setPriority(5);
        m2.setPriority(10);
        m3.setPriority(1);

        //void start() 导致此线程开始执行; Java虚拟机调用此线程的run方法
        m1.start();
        m2.start();
        m3.start();
    }
}
