package HomeWorkLesson1.Barriers;

import HomeWorkLesson1.Players.Player;

public class Treadmill extends Barrier{
    public Treadmill(int length) {
        setLengthRun(length);
    }

    @Override
    public String getInfo() {
        return "Длина дорожки: " + getLengthRun();
    }

    @Override
    public boolean takeMove(Player player) {
        return player.run(this);
    }
}
