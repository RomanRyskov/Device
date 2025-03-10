package Transport;

import java.util.*;


public class TransportManager {
    ArrayList<Transport> transportList = new ArrayList<Transport>();//все трансп средсвта
    Set<Transport> uniqueTransportSet = new HashSet<Transport>();


    void addTransport(Transport t) {
        transportList.add(t);
        uniqueTransportSet.add(t);
    }

    public void removeTransport(String model) {
        Iterator<Transport> itr = transportList.iterator();
        Iterator<Transport> itr2 = uniqueTransportSet.iterator();
        while (itr.hasNext()) {
            if (itr.next().getModel().equals(model)) {
                itr.remove();
            }
        }
        while (itr2.hasNext()) {
            if (itr2.next().getModel().equals(model)) {
                itr2.remove();
            }
        }
    }

    void sortTransportBySpeed() {
        Comparator<Transport> speedComparator = new speedComparator();
        transportList.sort(speedComparator);
        uniqueTransportSet = new TreeSet<Transport>(speedComparator);
        uniqueTransportSet.addAll(transportList);
    }

    void sortTransportByModel() {
        Comparator<Transport> modelComparator = new modelComparator();
        transportList.sort(modelComparator);
        uniqueTransportSet = new TreeSet<>(modelComparator);
        uniqueTransportSet.addAll(transportList);
    }

    public void printAllTransport() {
        System.out.println("Весь транспорт:");
        for (Transport transport : transportList) {
            System.out.println(transport);
        }
    }

    public void printUniqueTransport() {
        System.out.println("Уникальный транспорт:");
        for (Transport transport : uniqueTransportSet) {
            System.out.println(transport);

        }
    }
}