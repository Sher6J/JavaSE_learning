package Collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<HashStudent> hs = new HashSet<>();

        HashStudent s1 = new HashStudent("james", 34);
        HashStudent s2 = new HashStudent("james", 34);
        HashStudent s3 = new HashStudent("lebron", 35);
        HashStudent s4 = new HashStudent("hhh", 34);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        for (HashStudent s : hs) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
