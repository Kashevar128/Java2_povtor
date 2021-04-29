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
            if(barrier.getHeightJump() > this.getJumpRes()) {
                System.out.println("Человек " + this.getName() + " не смог перепрыгнуть и сел передохнуть.");
            }
            else System.out.println("Человек " + this.getName() + " перепрыгнул стену и пыхтя побежал дальше.");
    }

    @Override
    public void run(Barrier barrier) {
        if(barrier.getLengthRun() > this.getRunRes()) {
            System.out.println("Человек " + this.getName() + " не смог пробежать остановился и похромал к обочине.");
        }
    }

    @Override
    public void swim(Barrier barrier) {
        if(barrier.getLengthSwim() > this.getSwimRes()) {
            System.out.println("Человек " + this.getName() + " пускает пузыри.");
        }
    }
}
