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
        if(barrier.getHeightJump() > this.getJumpRes()) {
            System.out.println("Робот " + this.getName() + " прыгнул и подвернул себе конечность.");
        }
        else System.out.println("Робот " + this.getName() + " перепрыгнул и мигнул индикаторами.");
    }

    @Override
    public void run(Barrier barrier) {
        if(barrier.getLengthRun() > this.getRunRes()) {
            System.out.println("Робот " + this.getName() + " осался без топлива и не смог добежать.");
        }
        else System.out.println("Робот " + this.getName() + " пробежал и подал звуковой сигнал.");
    }
}
