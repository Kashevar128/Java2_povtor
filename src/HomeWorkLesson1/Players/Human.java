package HomeWorkLesson1.Players;

import HomeWorkLesson1.Barriers.Barrier;

public class Human extends Player {
    public Human(String name) {
        super(name);
        setJumpRes(rnd(0, 2));
        setRunRes(rnd(50, 100));
        setSwimRes(rnd(500, 1000));
    }

    @Override
    public boolean jump(Barrier barrier) {
        if (barrier.getHeightJump() > this.getJumpRes()) {
            System.out.println("Человек " + this.getName() + " не смог перепрыгнуть и сел передохнуть.");
            return false;
        } else {
            System.out.println("Человек " + this.getName() + " перепрыгнул стену и пыхтя побежал дальше.");
            return true;
        }
    }

    @Override
    public boolean run(Barrier barrier) {
        if (barrier.getLengthRun() > this.getRunRes()) {
            System.out.println("Человек " + this.getName() + " не смог пробежать остановился и похромал к обочине.");
            return false;
        } else {
            System.out.println("Человек " + this.getName() + " пробежал и готов бежать дальше!");
            return true;
        }
    }

    @Override
    public boolean swim(Barrier barrier) {
        if (barrier.getLengthSwim() > this.getSwimRes()) {
            System.out.println("Человек " + this.getName() + " пускает пузыри.");
            return false;
        } else {
            System.out.println("Человек " + this.getName() + " выплывает!");
            return true;
        }
    }
}
