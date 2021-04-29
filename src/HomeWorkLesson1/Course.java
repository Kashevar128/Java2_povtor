package HomeWorkLesson1;

import HomeWorkLesson1.Barriers.Barrier;
import HomeWorkLesson1.Barriers.Lake;
import HomeWorkLesson1.Barriers.Treadmill;
import HomeWorkLesson1.Barriers.Wall;
import HomeWorkLesson1.Players.Player;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final List<Barrier> obstacles;

    public Course() {
        obstacles = new ArrayList<>();
        obstacles.add(new Treadmill(500));
        obstacles.add(new Wall(1));
        obstacles.add(new Lake(200));
    }

    public void start(Team team) {
        for(Barrier barrier : obstacles) {
            String brStr = barrier.getClass().getName();

            if(brStr.equals(Lake.class.getName())) {
                team.getTeamComposition().removeIf(player -> !player.swim(barrier));
            }
            else if (brStr.equals(Treadmill.class.getName())) {
                team.getTeamComposition().removeIf(player -> !player.run(barrier));
            }
            else team.getTeamComposition().removeIf(player -> !player.jump(barrier));
        }
    }
}



