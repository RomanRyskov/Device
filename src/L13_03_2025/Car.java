package L13_03_2025;

public class Car extends Transport {
    private String fuelType;
    private final int maxSpeed;

    public Car(String model, int speed,String licensePlate, String fuelType) {
        super(model, speed, licensePlate);
        this.fuelType = fuelType;
        this.maxSpeed = 220;
    }

    @Override
    public String toString() {
        return "Автомобиль" + super.toString() + " Тип топлива: " + fuelType;
    }
}
