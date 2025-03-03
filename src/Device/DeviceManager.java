package Device;

class DeviceManager {

    public static void printDevice(Device device) {
        System.out.println(device);
    }

    public static void printDevice(Device[] devices) {
        for (Device device : devices) {
            System.out.println(device);
        }
    }

    public static int getTotalDevice() {
        return Device.totalDevices;
    }

    public static void chargeDevice(Chargeable device, int amount) {
        device.charge(amount);
    }

    public static void chargeDevice(Chargeable[] devices, int amount) {
        for (Chargeable device : devices) {
            device.charge(amount);
        }
    }
}
