package Transport;


import java.util.Comparator;
import java.util.Objects;

public abstract class Transport {
    private String model;
    private int speed;
    private String licensePlate;

    public Transport(String model, int speed, String licensePlate) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return ": Модель= " + model + ", Скорость=" + speed + ",";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(licensePlate, transport.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(licensePlate);
    }
}
