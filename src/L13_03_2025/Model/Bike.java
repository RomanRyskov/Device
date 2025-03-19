package L13_03_2025.Model;

public class Bike extends Transport {
    private boolean hasSidecar;

    public Bike(String model, int speed,String licensePlate, int year,User user, boolean hasSidecar) {
        super(model, speed, licensePlate,year,user);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Мотоцикл" + super.toString() + " наличие коляски: " + hasSidecar;

    }

}



