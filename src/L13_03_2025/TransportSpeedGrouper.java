package L13_03_2025;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TransportSpeedGrouper {
    private Map<Integer, Set<Transport>> transportBySpeed  = new HashMap<>();

    public void addTransport(Transport transport){
        transportBySpeed.putIfAbsent(transport.getSpeed(), new HashSet<>());
        transportBySpeed.get(transport.getSpeed()).add(transport);
    }
   public Set<Transport> getTransportBySpeed(int speed){
        return transportBySpeed.get(speed);
   }
}
