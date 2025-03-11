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

    void removeTransport(String model) {
        Iterator<Map.Entry<String, Transport>> it1 = transportByPlate.entrySet().iterator();
        while (it1.hasNext()) {
            String a = it1.next().getValue().getModel();
            if (a.equals(model)) {
                it1.remove();
            }
        }
        Iterator<Map.Entry<String, List<Transport>>> it2 = transportByType.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator<List<Transport>> it3 = transportByType.values().iterator();
            while (it3.hasNext()) {
                List<Transport> list = it3.next();
                Iterator<Transport> it4 = list.iterator();
                while (it4.hasNext()) {
                    Transport a = it4.next();
                    if (a.getModel().equals(model)) {
                        it4.remove();
                    }
                }
            }
            break;
        }
    }

    void findTransportByPlate(String licensePlate) {
        for (Map.Entry<String, Transport> transportEntry : transportByPlate.entrySet()) {
            String a = transportEntry.getKey();
            Transport transport = transportEntry.getValue();
            if (a.equals(licensePlate)) {
                System.out.println("Номерной знак: " + a + ", Соответсвует транспорту: " + transport);
            }
        }
    }

    void findTransportByType(String type) {
        for (Map.Entry<String, List<Transport>> transportEntry : transportByType.entrySet()) {
            String a = transportEntry.getKey();
            List<Transport> list = transportEntry.getValue();
            if (a.equals(type)) {
                System.out.println("Тип : " + a + ", включает следующие траснспортные средства: " + list);
            }
        }
    }

    void getFastestTransportByType(String type) {
        for (Map.Entry<String, List<Transport>> transportEntry : transportByType.entrySet()) {
            String a = transportEntry.getKey();
            List<Transport> list = transportEntry.getValue();
            Comparator<Transport> speedComparator = new speedComparator();
            list.sort(speedComparator);
            if (a.equals(type)) {
                System.out.println("Самый быстрый траспорт из " + type + " это: " + list.getLast());
            }
        }
    }

    void printAllTransport() {
       for (Map.Entry<String, Transport> transportEntry : transportByPlate.entrySet()) {
            System.out.println(transportEntry.getKey() + " : " + transportEntry.getValue());
        }
    }
}





