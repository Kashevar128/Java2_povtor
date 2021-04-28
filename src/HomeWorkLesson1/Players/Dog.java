package HomeWorkLesson1.Players;

import HomeWorkLesson1.Barriers.Barrier;
import HomeWorkLesson1.Interfaces.Jumping;
import HomeWorkLesson1.Interfaces.Running;
import HomeWorkLesson1.Interfaces.Swimming;

public class Dog extends Player implements Running, Swimming, Jumping {
    public Dog(String name) {
        super(name);
        setJumpRes(rnd(1, 2));
        setRunRes(rnd(1000, 3000));
        setSwimRes(rnd(100, 300));
    }

    @Override
    public void jump(Barrier barrier) {

    }

    @Override
    public void run(Barrier barrier) {

    }

    @Override
    public void swim(Barrier barrier) {

    }
}
