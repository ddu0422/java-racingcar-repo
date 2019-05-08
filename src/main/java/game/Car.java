package game;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getCarName() {
        return this.name;
    }

    public void move() {
        this.position++;
    }
}
