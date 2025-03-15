package L13_03_2025;

import java.util.HashMap;
import java.util.Map;

public class TransportStatistics {
    private Map<String, Integer> brandCount  = new HashMap<>();
    public void addTransport(Transport transport) {
        brandCount.putIfAbsent(transport.getModel(),1);
        brandCount.put(transport.getModel(),brandCount.get(transport.getModel())+1);
    }
    public int getBrandCount(String brand){
        return brandCount.get(brand);
    }
    public void printBrandStatistics(){
       for (Map.Entry<String, Integer> entry : brandCount.entrySet()) {
           System.out.println(entry.getKey() + ": " + entry.getValue());
       }
    }
}
