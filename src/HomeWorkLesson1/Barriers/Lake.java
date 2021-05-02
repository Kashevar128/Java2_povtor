package HomeWorkLesson1.Barriers;


import HomeWorkLesson1.Players.Player;

public class Lake extends Barrier{
    public Lake(int length) {
        setLengthSwim(length);
    }

    @Override
    public String getInfo() {
        return "Длина бассейна: " + getLengthSwim();
    }

    public boolean takeMove(Player player) {
       return player.swim(this);
    }
}
