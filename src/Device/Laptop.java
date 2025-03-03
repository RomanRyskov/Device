package Device;

final public class Laptop extends Device implements Chargeable {
    private final int batteryLife;

    Laptop(String serialNumber, String model, int batteryLife) {
        super(serialNumber, model);
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return super.toString() + " время работы от батареи: " + batteryLife + " часов, заряд:" + getBatteryLevel() + "%";
    }

    @Override
    public void charge(int amount) {
        batteryLevel += amount;
        if (batteryLevel > 100) batteryLevel = 100;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}
