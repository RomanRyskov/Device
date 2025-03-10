package Transport;

public class Car extends Transport {
    private String fuelType;

    public Car(String model, int speed, String licensePlate, String fuelType) {
        super(model, speed, licensePlate);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Автомобиль" + super.toString() + " Тип топлива: " + fuelType;
    }
}
