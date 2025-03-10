package Transport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportManager {
    Map<String, Transport> transportByPlate = new HashMap<>();
    Map<String, List<Transport>> transportByType = new HashMap<>();

    void addTransport(Transport transport){
        transportByPlate.put(transport.getLicensePlate(),transport);
    }
}
