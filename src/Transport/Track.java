package Transport;

public class Track extends Transport {
    private int loadCapacity;

    public Track(String model, int speed,String licensePlate, int loadCapacity) {
        super(model, speed, licensePlate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString() + " Грузоподъемность: " + loadCapacity;

    }
}
