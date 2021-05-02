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
        for (Barrier barrier : obstacles) {
            team.getTeamComposition().removeIf(player -> !player.movement(barrier));
        }
    }

    public void info() {
        System.out.println("ПАРАМЕТРЫ ПОЛОСЫ ПРЕПЯТСТВИЙ:");
        for(Barrier barrier : obstacles) {
            System.out.println(barrier);
        }
        System.out.println();
    }
}



