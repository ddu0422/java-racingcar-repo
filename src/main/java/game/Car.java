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

    public void move(int randomValue) {
        if (randomValue >= 4) {
            this.position++;
        }
    }

    public boolean isMaxInstance(int maxInstance) {
        return position == maxInstance;
    }

    public int getPosition() {
        return position;
    }


}
