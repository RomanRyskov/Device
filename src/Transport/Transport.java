package Transport;


import java.util.Comparator;
import java.util.Objects;

public class Transport {
    private String model;
    private int speed;

    public Transport(String model, int speed) {
        this.model = model;
        this.speed = speed;
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
        if(this == o) return true;
        if (o == null ) return false;
        Transport transport = (Transport) o;
        return Objects.equals(model, transport.model) && this.getClass() == o.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, this.getClass());
    }
}
