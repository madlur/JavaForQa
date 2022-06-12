package lesson01_hw.participants;

public abstract class Animal implements Participant {

    private String type;

    private String name;
    private int age;

    private boolean isOnDistance;

    protected int runDistance;
    protected int jumpHeight;
    protected int swimDistance;

    public Animal(String type, String name, int age, int runDistance, int jumpHeight, int swimDistance) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
        this.isOnDistance = true;
    }


    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void run(int distance) {
        if (!isOnDistance)
            return;
        if (distance > runDistance) {
            isOnDistance = false;
            System.out.println(type + " " + name + " не пробежал и сошел с дистанции");
            return;
        }
        System.out.println(type + " " + name + " успешно пробежал дистанцию");
    }

    @Override
    public void jump(int height) {
        if (!isOnDistance)
            return;
        if (height > jumpHeight) {
            isOnDistance = false;
            System.out.println(type + " " + name + " не перепрыгнул и сошел с дистанции");
            return;
        }
        System.out.println(type + " " + name + " успешно перепрыгнул");
    }

    @Override
    public void swim(int distance) {
        if (!isOnDistance)
            return;
        if (swimDistance == 0) {
            System.out.println(type + " " + name + " не умеет платавть и сходит с дистанции");
            isOnDistance = false;
            return;
        }
        if (distance > swimDistance) {
            isOnDistance = false;
            System.out.println(type + " " + name + " не проплыл и сошел с дистанции");
            return;
        }
        System.out.println(type + " " + name + " успешно проплыл дистанцию");
    }

    public void getInfo() {
        System.out.printf("%s, имя: %s, возраст: %s%n", type, name, age);
    }
}
