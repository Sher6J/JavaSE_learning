package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    对象序列化流
        构造方法：
            ObjectOutputStream (OutputStream out); 创建一个写入指定的OutputStream的ObjectOutputStream
        序列化对象的方法：
            void writeObject (Object obj); 将指定对象写入ObjectOutputStream
    NotSerializableException: 当实例需要具有Serializable接口时抛出
    实现java.io.Serializable接口的类启用了类的可序列化, 未实现此接口的类将不会将其任何状态序列化或反序列化
    Serializable接口是个标识接口, 没有方法需要重写
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));

        //创建对象
        Student s = new Student("james", 49, 89, 100);

        //序列化对象
        oos.writeObject(s);

        oos.close();
    }
}
