package Device;

import java.util.Objects;
import java.util.Random;

abstract class Device implements Chargeable {
    protected static int totalDevices;
    private final String serialNumber;
    private final String model;
    protected int batteryLevel;
    Random rand = new Random();

    Device(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.batteryLevel = rand.nextInt(100);
        ++totalDevices;
    }

    final String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        return serialNumber.equals(device.serialNumber);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "Устройство: " + model + ", серийный номер: " + serialNumber;
    }
}

