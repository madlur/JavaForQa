package lesson01_hw;

import lesson01_hw.obstacles.Course;
import lesson01_hw.obstacles.Cross;
import lesson01_hw.obstacles.Wall;
import lesson01_hw.obstacles.Water;
import lesson01_hw.participants.Cat;
import lesson01_hw.participants.Dog;
import lesson01_hw.participants.Elephant;
import lesson01_hw.participants.Team;

public class MainApp {
    public static void main(String[] args) {
        Course course = new Course(
                new Wall(1),
                new Cross(3000),
                new Water(300)
        );

        Team team = new Team(
                "Команда",
                new Cat("Кот", 2, 3000, 2),
                new Dog("Собака", 3, 7000, 1, 500),
                new Elephant("Слон", 4, 1000, 0, 200)
        );

        course.doIt(team);
        team.getResults();
    }
}
