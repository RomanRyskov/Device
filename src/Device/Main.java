package Device;

public class Main {
    public static void main(String[] args) {
        Device phone1 = new Smartphone("123-456-789", "Galaxy S21", 108);
        Device laptop1 = new Laptop("987-654-321", "MacBook Pro", 10);

        DeviceManager.printDevice(phone1);
        DeviceManager.printDevice(laptop1);

        System.out.println("\nЗаряжаем устройства:");
        DeviceManager.chargeDevice(phone1, 30);
        DeviceManager.chargeDevice(laptop1, 50);

        System.out.println("\nПосле зарядки:");
        DeviceManager.printDevice(phone1);
        DeviceManager.printDevice(laptop1);

        Chargeable[] chargeables = {phone1, laptop1};
        System.out.println("\nЗаряжаем все устройства еще раз:");
        DeviceManager.chargeDevice(chargeables, 20);

        System.out.println("\nПосле повторной зарядки:");
        DeviceManager.printDevice(phone1);
        DeviceManager.printDevice(laptop1);
    }
}
