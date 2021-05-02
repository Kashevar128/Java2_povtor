package HomeWorkLesson1.Players;

import HomeWorkLesson1.Barriers.Barrier;


public class Dog extends Player {
    public Dog(String name) {
        super(name);
        setJumpRes(rnd(1, 2));
        setRunRes(rnd(1000, 3000));
        setSwimRes(rnd(100, 300));
    }

    @Override
    public boolean jump(Barrier barrier) {
        if (barrier.getHeightJump() > this.getJumpRes()) {
            System.out.println("Пес " + this.getName() + " не смог перепрыгнуть и скулит рядом со стенкой.");
            return false;
        } else {
            System.out.println("Пес " + this.getName() + " перепрыгнул стену и лая побежал дальше.");
            return true;
        }
    }

    @Override
    public boolean run(Barrier barrier) {
        if (barrier.getLengthRun() > this.getRunRes()) {
            System.out.println("Пес " + this.getName() + " не смог пробежать и лежит дрыгая лапами.");
            return false;
        } else {
            System.out.println("Пес " + this.getName() + " пробежал, выкусывая блох на ходу.");
            return true;
        }
    }

    @Override
    public boolean swim(Barrier barrier) {
        if (barrier.getLengthSwim() > this.getSwimRes()) {
            System.out.println("Пес " + this.getName() + " захлебнулся водой.");
            return false;
        } else {
            System.out.println("Пес " + this.getName() + " переплыл и отряхнулся от воды.");
            return true;
        }
    }
}
