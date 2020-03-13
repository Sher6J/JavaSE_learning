package Interface;
/*
    测试类
 */
public class JumppingDemo {
    public static void main(String[] args) {
//        Jumpping j = new Jumpping(); //报错, 接口是抽象的, 不能被实例化

        Jumpping j = new Cat();  //接口实例化采用多态
        j.jump();
    }
}
