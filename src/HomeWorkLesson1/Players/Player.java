package HomeWorkLesson1.Players;
import HomeWorkLesson1.Barriers.Barrier;

public abstract class Player {
    private final String name;
    private int runRes;
    private int jumpRes;
    private int swimRes;

    public void setRunRes(int runRes) {
        this.runRes = runRes;
    }

    public void setJumpRes(int jumpRes) {
        this.jumpRes = jumpRes;
    }

    public void setSwimRes(int swimRes) {
        this.swimRes = swimRes;
    }

    public String getName() {
        return name;
    }

    public int getRunRes() {
        return runRes;
    }

    public int getJumpRes() {
        return jumpRes;
    }

    public int getSwimRes() {
        return swimRes;
    }

    public Player(String name) {
        this.name = name;
    }

    public boolean movement(Barrier barrier) {
        return barrier.takeMove(this);
    }

    abstract public boolean jump(Barrier barrier);

    abstract  public boolean run(Barrier barrier);

    abstract public boolean swim(Barrier barrier);

    public static int rnd(int min, int max) {
        return (int) (Math.random() * max) + min;
    }

    @Override
    public String toString() {
        return getClass().getName() + ":\n" + "Имя: " + getName() + "\n" + "Дальность бега: " + getRunRes() + "\n" +
                "Высота прыжка: " + getJumpRes() + "\n" + "Дальность плавания: " + getSwimRes();

    }
}
