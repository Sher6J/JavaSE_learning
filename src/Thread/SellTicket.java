package Thread;

public class SellTicket implements Runnable {
    private int tickets = 100; //有100张票
    private Object obj = new Object();

    //重写run()方法, 实现卖票
    @Override
    public void run() {
        //1. 判断票数大于0, 就卖票, 并告知是哪个窗口卖的
        //2. 卖了票之后, 总票数减一
        //3. 票没了, 也有人可能来, 用死循环让卖票动作一直进行
//        while (true) {
//            synchronized (new Object()) {  //三个线程用了三把锁！！是锁不住的！！！
//                if (tickets > 0) {
//                    //通过sleep()方法来模拟出票时间
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                    tickets--;
//                }
//            }
//        }
        while (true) {
            //tickets = 100
            //t1, t2, t3
            //假设t1抢到了CPU执行权
            //t1进去后, t2抢到了CPU执行权, 但是下面代码上锁, t2等待t1出来后锁释放
            synchronized (obj) {
                //t1进来后把这段代码锁起来
                if (tickets > 0) {
                    //通过sleep()方法来模拟出票时间
                    try {
                        Thread.sleep(100);
                        //t1休息
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //窗口1进行出售第100张票
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--; //99
                }
            }
            //t1出来了,锁被释放
        }
    }
}
