package HomeWorkLesson1.Players;

import HomeWorkLesson1.Barriers.Barrier;
import HomeWorkLesson1.Interfaces.Jumping;
import HomeWorkLesson1.Interfaces.Running;
import HomeWorkLesson1.Interfaces.Swimming;

public class Human extends Player implements Running, Swimming, Jumping {
    public Human(String name) {
        super(name);
        setJumpRes(rnd(0, 2));
        setRunRes(rnd(50, 100));
        setSwimRes(rnd(500, 1000));
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
