package L13_03_2025;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportStatistics {
    private Map<String, Integer> brandCount = new HashMap<>();

    public void addTransport(Transport transport) {
        brandCount.putIfAbsent(transport.getClass().getSimpleName(), 1);
        brandCount.put(transport.getModel(), brandCount.get(transport.getModel() + 1));
    }

    public int getBrandCount(String model) {
        return brandCount.get(model);
    }

    public void printBrandStatistics() {
        System.out.println("Статистика транспорта: ");
        for (Map.Entry<String, Integer> entry : brandCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
