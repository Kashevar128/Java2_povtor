package HomeWorkLesson1.Barriers;

import HomeWorkLesson1.Players.Player;

public abstract class Barrier {
    private int heightJump;
    private int lengthRun;
    private int lengthSwim;

    public void setHeightJump(int heightJump) {
        this.heightJump = heightJump;
    }

    public void setLengthRun(int lengthRun) {
        this.lengthRun = lengthRun;
    }

    public void setLengthSwim(int lengthSwim) {
        this.lengthSwim = lengthSwim;
    }

    public int getHeightJump() {
        return heightJump;
    }

    public int getLengthRun() {
        return lengthRun;
    }

    public int getLengthSwim() {
        return lengthSwim;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return getInfo();
    }

    public abstract boolean takeMove(Player player);
}
