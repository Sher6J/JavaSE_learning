package Collection;

public class TreeSetStudent {
    private String name;
    private int math;
    private int chinese;

    public TreeSetStudent() {
    }

    public TreeSetStudent(String name, int math, int chinese) {
        this.name = name;
        this.math = math;
        this.chinese = chinese;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getSum() {
        return this.chinese + this.math;
    }
}
