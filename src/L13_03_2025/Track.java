package L13_03_2025;

public class Track extends Transport {
    private int loadCapacity;
    private int maxSpeed;

    public Track(String model, int speed,String licensePlate, int loadCapacity) {
        super(model, speed, licensePlate);
        this.loadCapacity = loadCapacity;
        this.maxSpeed = 120;
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString() + " Грузоподъемность: " + loadCapacity;

    }
}
