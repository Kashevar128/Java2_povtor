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
        if(barrier.getHeightJump() > this.getJumpRes()) {
            System.out.println("Пес " + this.getName() + " не смог перепрыгнуть и скулит рядом со стенкой.");
        }
        else System.out.println("Пес " + this.getName() + " перепрыгнул стену и лая побежал дальше");
    }

    @Override
    public void run(Barrier barrier) {
        if(barrier.getLengthRun() > this.getRunRes()) {
            System.out.println("Пес" + this.getName() + " не смог пробежать и лежит дрыгая лапами.");
        }
        else System.out.println("Пес" + this.getName() + " пробежал, выкусывая блох на ходу.");
    }

    @Override
    public void swim(Barrier barrier) {
        if (barrier.getLengthSwim() > this.getSwimRes()) {
            System.out.println("Пес " + this.getName() + " захлебнулся водой.");
        }
        else System.out.println("Пес " + this.getName() + " переплыл и отряхнулся от воды.");
    }
}
