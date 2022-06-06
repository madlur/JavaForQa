package lesson01_hw.obstacles;

import lesson01_hw.participants.Participant;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {

        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {

        participant.jump(height);
    }
}