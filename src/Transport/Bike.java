package Transport;

import java.io.Serializable;

public class Bike extends Transport {
    private boolean hasSidecar;

    public Bike(String model, int speed,String licensePlate, boolean hasSidecar) {
        super(model, speed, licensePlate);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Мотоцикл" + super.toString() + " наличие коляски: " + hasSidecar;

    }

}



