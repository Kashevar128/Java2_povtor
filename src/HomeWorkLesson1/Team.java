package HomeWorkLesson1;

import HomeWorkLesson1.Players.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private final String name;
    private final List<Player> teamComposition;

    public Team(String name) {
        this.name = name;
        this.teamComposition = new ArrayList<Player>();
        teamComposition.add(new Cat("Барсик"));
        teamComposition.add(new Dog("Шарик"));
        teamComposition.add(new Human("Чел"));
        teamComposition.add(new Robot("S3P0"));
    }

    public String getName() {
        return name;
    }

    public List<Player> getTeamComposition() {
        return teamComposition;
    }

    public void showPlayers() {
        for (Player player : teamComposition) {
            System.out.println(player.toString() + "\n");
        }
    }
}
