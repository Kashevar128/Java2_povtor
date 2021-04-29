package HomeWorkLesson1.Players;

import HomeWorkLesson1.Barriers.Barrier;

public class Robot extends Player {
    public Robot(String name) {
        super(name);
        setJumpRes(rnd(7, 10));
        setRunRes(rnd(2000, 5000));
    }

    @Override
    public boolean jump(Barrier barrier) {
        if (barrier.getHeightJump() > this.getJumpRes()) {
            System.out.println("Робот " + this.getName() + " прыгнул и подвернул себе конечность.");
            return false;
        } else {
            System.out.println("Робот " + this.getName() + " перепрыгнул и мигнул индикаторами.");
            return true;
        }
    }

    @Override
    public boolean run(Barrier barrier) {
        if (barrier.getLengthRun() > this.getRunRes()) {
            System.out.println("Робот " + this.getName() + " остался без топлива и не смог добежать.");
            return false;
        } else {
            System.out.println("Робот " + this.getName() + " пробежал и подал звуковой сигнал.");
            return true;
        }
    }

    @Override
    public boolean swim(Barrier barrier) {
        System.out.println("Робот вырубился и утонул.");
        return false;
    }
}
