package Transport;

import java.util.*;

public class TransportManager {
    Map<String, Transport> transportByPlate = new HashMap<>();
    Map<String, List<Transport>> transportByType = new HashMap<String, List<Transport>>();

    void addTransport(Transport transport) {
        transportByPlate.put(transport.getLicensePlate(), transport);
        transportByType.putIfAbsent(transport.getClass().getSimpleName(), new ArrayList<>());
        transportByType.get(transport.getClass().getSimpleName()).add(transport);
    }

    void removeTransport(String LicensePlate) {
        transportByPlate.remove(LicensePlate);
        Iterator<Map.Entry<String, List<Transport>>> it = transportByType.entrySet().iterator();
        while (it.hasNext()) {
            List<Transport> list = it.next().getValue();
            Iterator<Transport> it2 = list.iterator();
            while (it2.hasNext()) {
                Transport transport = it2.next();
                if (transport.getLicensePlate().equals(LicensePlate)) {
                    it2.remove();
                }
            }
        }
    }



    public Transport findTransportByPlate(String licensePlate) {
        return transportByPlate.get(licensePlate);
    }

    public List<Transport> findTransportByType(String type) {
        return transportByType.get(type);
    }

    public Transport getFastestTransportByType(String type) {
        List<Transport> list = transportByType.get(type);
        Comparator<Transport> speedComparator = new speedComparator();
        list.sort(speedComparator);
        return list.getLast();
    }

    void printAllTransport() {
        for (Map.Entry<String, Transport> transportEntry : transportByPlate.entrySet()) {
            System.out.println(transportEntry.getKey() + " : " + transportEntry.getValue());
        }
    }
}





