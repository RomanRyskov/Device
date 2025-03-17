package L13_03_2025.Services;

import L13_03_2025.Model.Transport;
import L13_03_2025.Comparator.SpeedComparator;
import L13_03_2025.User;

import java.util.*;

public class TransportUserManager {
    public Map<User, List<Transport>> transportByOwner = new HashMap<>();

    public void addTransport(Transport transport) {
        transportByOwner.putIfAbsent(transport.getUser(), new ArrayList<>());
        transportByOwner.get(transport.getUser()).add(transport);
    }

    public List<Transport> getTransportByOwner(User owner) {
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate) {
        List<Transport> transports = transportByOwner.get(owner);
        Iterator<Transport> it = transports.iterator();
        while (it.hasNext()) {
            Transport transport = it.next();
            if (transport.getLicensePlate().equals(licensePlate)) {
                it.remove();
            }
        }
    }

    public Transport getFastestTransport(User owner) {
        Comparator speed = new SpeedComparator();
        transportByOwner.get(owner).sort(speed);
        return transportByOwner.get(owner).getLast();
    }

    public User findOwnerWithMostCars() {
        TreeMap<Integer, User> countCars = new TreeMap<>();
        for (Map.Entry<User, List<Transport>> userEntry : transportByOwner.entrySet()) {
            countCars.put(userEntry.getValue().size(), userEntry.getKey());
        }
        return countCars.lastEntry().getValue();
    }

    public void printAllOwnersAndTransports() {
        for (Map.Entry<User, List<Transport>> userEntry : transportByOwner.entrySet()) {
            System.out.println(userEntry.getKey() + " : " + userEntry.getValue());
        }
    }
}
