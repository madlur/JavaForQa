package lesson01_hw.obstacles;

import lesson01_hw.participants.Participant;

public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance) {

        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {

        participant.run(distance);
    }
}
