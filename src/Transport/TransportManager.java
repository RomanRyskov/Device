package Transport;

import java.util.*;


public class TransportManager {
    ArrayList<Transport> transportList = new ArrayList<Transport>();//все трансп средсвта
    Set<Transport> uniqueTransportSet = new HashSet<Transport>();


    void addTransport(Transport t) {
        transportList.add(t);
        uniqueTransportSet.add(t);
    }

    void removeTransport(String model) {

    }

    void sortTransportBySpeed() {
        Comparator<Transport> speedComparator = new speedComparator();
        transportList.sort(speedComparator);

    }
    void sortTransportByModel() {
        Comparator<Transport> modelComparator = new modelComparator();
        transportList.sort(modelComparator);
        uniqueTransportSet = new TreeSet<>(modelComparator);
        uniqueTransportSet.addAll(transportList);
    }
}