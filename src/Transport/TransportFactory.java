package Transport;

import java.util.List;
import java.util.Random;


public class TransportFactory extends Transport {
    public TransportFactory(String model, int speed) {
        super(model, speed);
    }
    private static final Random rand = new Random();
    private static final List<String> models = List.of("BMW", "HONDA", "OPEL", "MERSEDES");

    public static Transport next() {
        String name = models.get(rand.nextInt(models.size()));
        int speed = rand.nextInt(20, 200);
        String fuelType = rand.nextBoolean() ? "Дизель" : "Бензин";
        boolean hasSidecar = rand.nextBoolean();
        int loadCapacity = rand.nextInt(500, 2000);

        return switch (rand.nextInt(1, 4)) {
            case 1 -> new Car(name, speed, fuelType);
            case 2 -> new Bike(name, speed, hasSidecar);
            case 3 -> new Track(name, speed, loadCapacity);
            default -> null;
        };
    }
}

