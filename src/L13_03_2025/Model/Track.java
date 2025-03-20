package L13_03_2025.Model;

public class Track extends Transport {
    private int loadCapacity;


    public Track(String model, int speed,String licensePlate,int year, int loadCapacity) {
        super(model, speed, licensePlate, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString() + " Грузоподъемность: " + loadCapacity;

    }
}
