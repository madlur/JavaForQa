package lesson01_hw.obstacles;

import lesson01_hw.participants.Participant;
import lesson01_hw.participants.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Participant participant : team.getParticipants()) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(participant);

                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
    }
}