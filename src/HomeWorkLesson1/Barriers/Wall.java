package HomeWorkLesson1.Barriers;

import HomeWorkLesson1.Players.Player;

public class Wall extends Barrier{
    public Wall(int height) {
        setHeightJump(height);
    }

    @Override
    public String getInfo() {
        return "Высота стены: " + getHeightJump();
    }

    public boolean takeMove(Player player) {
        return player.jump(this);
    }

}
