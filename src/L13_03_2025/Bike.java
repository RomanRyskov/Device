package L13_03_2025;

public class Bike extends Transport {
    private boolean hasSidecar;
    private final int maxSpeed;

    public Bike(String model, int speed, String licensePlate, boolean hasSidecar) {
        super(model, speed, licensePlate);
        this.hasSidecar = hasSidecar;
        this.maxSpeed = 250;
    }

    @Override
    public String toString() {
        return "Мотоцикл" + super.toString() + " наличие коляски: " + hasSidecar;

    }

}



