package L13_03_2025;

public class Bike extends Transport {
    private boolean hasSidecar;

    public Bike(String model, int speed,String licensePlate, int year, boolean hasSidecar) {
        super(model, speed, licensePlate,year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Мотоцикл" + super.toString() + " наличие коляски: " + hasSidecar;

    }

}



