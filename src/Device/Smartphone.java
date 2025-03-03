package Device;

final public class Smartphone extends Device implements Chargeable {
    final private int cameraResolution;

    Smartphone(String serialNumber, String model, int cameraResolution) {
        super(serialNumber, model);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return super.toString() + " камера: " + cameraResolution + " MP, заряд: " + getBatteryLevel() + "%";
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
