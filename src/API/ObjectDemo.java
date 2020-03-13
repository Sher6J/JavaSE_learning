package API;
/*
    Object是类层次结构的根, 每个类都可以将Object作为超类.所有类都直接或简介继承自该类

    看方法的源码, 选中方法,　按下Ctrl+B

    toString()建议所有子类重写此方法
    如何重写呢？自动生成即可

    public boolean equals (Object obj);　指示一些其他对象是否等于此
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("james");
        s1.setAge(36);
        System.out.println(s1); //API.Student@c818063（若没有重写）
        System.out.println(s1.toString()); //同上

        /*
        public void println(Object x) { //x = s;
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }
        */

        /*
        public static String valueOf(Object obj) { //obj = x;
            return (obj == null) ? "null" : obj.toString();
        }
        */

        /*
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }*/

        Student s2 = new Student();
        s2.setName("james");
        s2.setAge(36);

        //需求,　比较两个对象的内容是否相同
//        System.out.println(s1 == s2);  //false

        /*//equals默认为比较对象本身, 需要重写！！！
        System.out.println(s1.equals(s2)); //false
        *//*
        public boolean equals(Object obj) {
            //this -> s1
            //obj -> s2
            return (this == obj);
        }*/

        System.out.println(s1.equals(s2));
        /*
        @Override
        public boolean equals(Object o) {
            //this -> s1
            //o ->s2
            //比较地址是否相同
            if (this == o) return true;
            //判断参数是否为null||判断两个类型是否来自同一个类
            if (o == null || getClass() != o.getClass()) return false;

            //向下转型
            Student student = (Student) o;

            if (age != student.age) return false;
            return name != null ? name.equals(student.name) : student.name == null;
        }*/

    }
}
