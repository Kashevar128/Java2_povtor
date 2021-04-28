package HomeWorkLesson1;

import HomeWorkLesson1.Players.Player;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final String name;
    private final List<Player> teamComposition;

    public Team(String name) {
        this.name = name;
        this.teamComposition = new ArrayList<>() {};
    }

    public String getName() {
        return name;
    }

    public List<Player> getTeamComposition() {
        return teamComposition;
    }

    public void showResults() {

    }
}
