package HomeWorkLesson1;

public class Test {
    public static void main(String[] args) {
        Team team = new Team("Затупки");
        Course course = new Course();

        course.info();
        team.showPlayers(true);
        course.start(team);
        System.out.println("\nФИНИШИРОВАЛИ:");
        team.showPlayers(false);
    }
}
