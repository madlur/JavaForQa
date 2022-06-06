package lesson01_hw.participants;

public class Team {
    private String name;
    private Participant[] participants;

    public Team(String name, Participant participant1, Participant participant2, Participant participant3) {
        this.name = name;
        this.participants = new Participant[]{participant1, participant2, participant3};
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public void getResults() {
        for (Participant p : participants) {
            if (p.isOnDistance())
                p.getInfo();
        }
    }
}