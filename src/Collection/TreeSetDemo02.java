package Collection;
/*
    需求：
        用TreeSet集合存储多个学生信息（姓名, 语文成绩, 数学成绩）, 并遍历该集合
        要求, 按照总分从高到低出现
 */

import ArrayList.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        TreeSet<TreeSetStudent> ts = new TreeSet<>(new Comparator<TreeSetStudent>() {
            @Override
            public int compare(TreeSetStudent s1, TreeSetStudent s2) {
                //主要条件
                int num = s2.getSum() - s1.getSum();
                //次要条件
                int num2 = num == 0 ? s2.getMath() - s1.getMath() : num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;

            }
        });

        TreeSetStudent s1 = new TreeSetStudent("james", 100, 98);
        TreeSetStudent s2 = new TreeSetStudent("lebron", 95, 95);
        TreeSetStudent s3 = new TreeSetStudent("liujx", 93, 100);
        TreeSetStudent s4 = new TreeSetStudent("harden", 97, 100);
        TreeSetStudent s5 = new TreeSetStudent("asfaadf", 98, 98);

        TreeSetStudent s6 = new TreeSetStudent("jjjj", 96, 100);
        TreeSetStudent s7 = new TreeSetStudent("zzzz", 96, 100);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        for (TreeSetStudent s : ts) {
            System.out.println(s.getName() + "," + s.getMath() + "," + s.getChinese() + "," + s.getSum());
        }
    }
}
