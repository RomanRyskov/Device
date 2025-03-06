package Transport;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class TransportFactory extends Transport {
    public TransportFactory(String model, int speed) {
        super(model, speed);
    }

    private static final Random rand = new Random();
    private static final  List<String> models = List.of("BMW","HONDA", "OPEL","MERSEDES");
    public static Transport next(){
        String name = models.get(rand.nextInt(models.size()));
        int speed = rand.nextInt(20,200);

    }
}
