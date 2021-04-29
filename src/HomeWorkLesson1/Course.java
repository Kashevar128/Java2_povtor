package HomeWorkLesson1;

import HomeWorkLesson1.Barriers.Barrier;
import HomeWorkLesson1.Barriers.Lake;
import HomeWorkLesson1.Barriers.Treadmill;
import HomeWorkLesson1.Barriers.Wall;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final List<Barrier>obstacles;

    public Course() {
        obstacles = new ArrayList<Barrier>();
        obstacles.add(new Treadmill(500));
        obstacles.add(new Wall(3));
        obstacles.add(new Lake(200));
    }


}
