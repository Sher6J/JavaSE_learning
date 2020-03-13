package IO;
/*
    用对象序列化流序列化了一个对象后, 修改了对象所属的类文件, 读取数据会不会出问题呢？
        IO.ObjectStreamDemo
        Exception in thread "main"
        java.io.InvalidClassException: IO.Student;
        local class incompatible:
        stream classdesc serialVersionUID = 3238298404630950362,
        local class serialVersionUID = -2557980438983197502
            Serialization运行时检测到类的以下问题之一时抛出：
                该类的串行版本与从流中读取的类描述符的版本不匹配 -> 自己设定serialVersionUID, 不用系统自动生成
                该类包含未知的数据类型
                该类没有可访问的no-arg构造函数

    如果出问题了, 如何解决呢？
        给对象所属类加一个值：private static final long serialVersionUID = 42L;

    如果一个对象中的某个成员变量的值不想被序列化, 又该如何实现呢？
        private transient int math;
 */
import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    //反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getMath());
        ois.close();
    }

    //序列化
    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        Student s = new Student("james", 90, 88, 56);
        oos.writeObject(s);
        oos.close();

    }

}
