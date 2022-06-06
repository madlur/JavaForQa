package lesson01_hw.participants;

public interface Participant {

    void getInfo();

    boolean isOnDistance();

    void run(int distance);

    void jump(int height);

    void swim(int distance);
}
