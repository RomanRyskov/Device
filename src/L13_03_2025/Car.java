package L13_03_2025;

public class Car extends Transport {
    private String fuelType;

    public Car(String model, int speed, String licensePlate,int year, String fuelType) {
        super(model, speed, licensePlate,year);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Автомобиль" + super.toString() + " Тип топлива: " + fuelType;
    }
}
