package HomeWorkLesson1.Players;

import HomeWorkLesson1.Barriers.Barrier;

public class Cat extends Player {
    public Cat(String name) {
        super(name);
        setJumpRes(rnd(1, 4));
        setRunRes(rnd(30, 50));
    }

    @Override
    public boolean jump(Barrier barrier) {
        if (barrier.getHeightJump() > this.getJumpRes()) {
            System.out.println("Кот " + this.getName() + " не смог перепрыгнуть и царапает стенку.");
            return false;
        } else {
            System.out.println("Кот " + this.getName() + " перепрыгнул стену и задрал хвост трубой!");
            return true;
        }
    }

    @Override
    public boolean run(Barrier barrier) {
        if (barrier.getLengthRun() > this.getRunRes()) {
            System.out.println("Кот " + this.getName() + " не смог пробежать и валяется кверху пузом.");
            return false;
        } else {
            System.out.println("Кот " + this.getName() + " пробежал высунув язык.");
            return true;
        }
    }

    @Override
    public boolean swim(Barrier barrier) {
        System.out.println("Иди на хрен! Я кот! Я не умею плавать!");
        return false;
    }
}
