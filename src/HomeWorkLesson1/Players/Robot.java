package HomeWorkLesson1.Players;

import HomeWorkLesson1.Barriers.Barrier;
import HomeWorkLesson1.Interfaces.Jumping;
import HomeWorkLesson1.Interfaces.Running;

public class Robot extends Player implements Running, Jumping {
    public Robot(String name) {
        super(name);
        setJumpRes(rnd(7, 10));
        setRunRes(rnd(2000, 5000));
    }

    @Override
    public void jump(Barrier barrier) {
    }

    @Override
    public void run(Barrier barrier) {

    }
}
