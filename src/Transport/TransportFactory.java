package Transport;

import java.util.List;
import java.util.Random;


public class TransportFactory extends Transport {
    public TransportFactory(String model, int speed,String licensePlate) {
        super(model, speed,licensePlate);
    }
    private final static Random rand = new Random();
    private final static List<String> models = List.of("BMW", "HONDA", "OPEL", "MERSEDES");

    public static Transport next() {
        String name = models.get(rand.nextInt(models.size()));
        int speed = rand.nextInt(20, 200);
        String fuelType = rand.nextBoolean() ? "Дизель" : "Бензин";
        boolean hasSidecar = rand.nextBoolean();
        int loadCapacity = rand.nextInt(500, 2000);
        char randomChar = (char) ('A' + rand.nextInt(26));
        char randomChar2 = (char) ('A' + rand.nextInt(26));
        int reg = rand.nextInt(1,9);



        String licensePlate = String.valueOf (rand.nextInt(1000,10000))+" "+randomChar+randomChar2+"-"+String.valueOf(reg);

        return switch (rand.nextInt(1, 4)) {
            case 1 -> new Car(name, speed, licensePlate, fuelType);
            case 2 -> new Bike(name, speed,licensePlate, hasSidecar);
            case 3 -> new Track(name, speed, licensePlate, loadCapacity);
            default -> null;
        };
    }

}

