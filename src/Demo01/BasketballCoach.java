package Demo01;

import javax.sound.midi.Soundbank;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉");
    }
}
