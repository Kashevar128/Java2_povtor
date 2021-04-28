package HomeWorkLesson1.Players;

import HomeWorkLesson1.Barriers.Barrier;
import HomeWorkLesson1.Interfaces.Jumping;
import HomeWorkLesson1.Interfaces.Running;

public class Cat extends Player implements Running, Jumping {
    public Cat(String name) {
        super(name);
        setJumpRes(rnd(1, 4));
        setRunRes(rnd(30, 50));
    }

    @Override
    public void jump(Barrier barrier) {
        if(barrier.getHeightJump() > this.getJumpRes()) {
            System.out.println("Кот " + this.getName() + " не смог перепрыгнуть и царапает стенку.");
        }
        else System.out.println("Кот " + this.getName() + " перепрыгнул стену и задрал хвост трубой!");
    }

    @Override
    public void run(Barrier barrier) {
        if(barrier.getLengthRun() > this.getRunRes()) {
            System.out.println("Кот" + this.getName() + " не смог пробежать и валяется кверху пузом.");
        }
        else System.out.println("Кот" + this.getName() + " пробежал высунув язык.");
    }
}
