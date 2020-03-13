package extendClass;
/*
    新手机
 */
public class NewPhone extends Phone{
    //方法重写
    @Override  //检查方法重写时声明的重要性
    public void call(String name) {
        System.out.println("开启视频功能");
//        System.out.println("给" + name + "打电话");
        super.call(name);
    }
}
