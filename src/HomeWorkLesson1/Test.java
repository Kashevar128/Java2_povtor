package HomeWorkLesson1;

public class Test {
    public static void main(String[] args) {
        Team team = new Team("Затупки");
        Course course = new Course();

        team.showPlayers();
        course.start(team);
        System.out.println("\nФИНИШИРОВАЛИ:");
        team.showPlayers();
    }
}
