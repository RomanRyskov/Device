package L13_03_2025.Services;

import java.util.*;

import L13_03_2025.Comparator.TransportMapKeyComparator;
import L13_03_2025.Comparator.TransportYearCompratator;
import L13_03_2025.Model.Transport;
import L13_03_2025.Model.User;


public class TransportService {
    public static final List<Transport> transports = new ArrayList<>();


    public List<Transport> getTransports() {
        return transports;
    }

    public User findBiLicensePlate(String licensePlate) {
        for (Transport t : transports) {
            if (t.getLicensePlate().equals(licensePlate)) {
                return t.getUser();
            }
        }
        return null;
    }

    public Map<String, List<User>> groupOwnersByCarCount() {
        Map<String, List<User>> byCarCount = Map.of("1-2 машины", new ArrayList<>(),
                "3-5 машины", new ArrayList<>(),
                "6 и более машин", new ArrayList<>());
        for (Transport t : transports) {
            if (t.getUser().getCountCar() < 3) {
                byCarCount.get("1-2 машины").add(t.getUser());
            }
            if (t.getUser().getCountCar() > 3 && t.getUser().getCountCar() < 6) {
                byCarCount.get("3-5 машины").add(t.getUser());
            }
            if (t.getUser().getCountCar() > 6) {
                byCarCount.get("6 и более машин").add(t.getUser());
            }
        }
        return byCarCount;
    }

    public List<String> findTop5MostPopularBrands() {
        Map<String, Integer> countModel = new HashMap<>();
        List<String> top5Brands = new ArrayList<>();
        for (Transport t : transports) {
            countModel.putIfAbsent(t.getModel(), 1);
            if (countModel.containsKey(t.getModel())) {
                countModel.put(t.getModel(), countModel.get(t.getModel()) + 1);
            }
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(countModel.entrySet());
        entryList.sort(new TransportMapKeyComparator());
        for (int i = 0; i < 5; i++) {
            top5Brands.add(entryList.get(i).getKey());
        }
        return top5Brands;
    }

    public Map<String, List<Transport>> groupByAge() {
        Map<String, List<Transport>> mapByAge = Map.of("Новые", new ArrayList<>(), "Средние", new ArrayList<>(), "Старые", new ArrayList<>());
        for (Transport t : transports) {
            int age = 2025 - t.getYear();
            if (age < 4) {
                mapByAge.get("Новые").add(t);
            }
            if (age > 3 & age < 11) {
                mapByAge.get("Средние").add(t);
            }
            if (age > 10) {
                mapByAge.get("Старые").add(t);
            }
        }
        return mapByAge;
    }

    public Map<String, Integer> countTransportByType() {
        Map<String, Integer> map = new HashMap<>();
        for (Transport t : transports) {
            map.putIfAbsent(t.getClass().getSimpleName(), 1);
            if (map.containsKey(t.getClass().getSimpleName())) {
                map.put(t.getClass().getSimpleName(), map.get(t.getClass().getSimpleName()) + 1);
            }
        }
        return map;
    }

    public User findOwnerWithOldestCar() {
        int min = 2025;
        Map<User, List<Transport>> findUserOldCar = new HashMap<>();
        for (Transport t : transports) {
            findUserOldCar.putIfAbsent(t.getUser(), new ArrayList<>());
            if (findUserOldCar.containsKey(t.getUser())) {
                findUserOldCar.get(t.getUser()).add(t);
            }
        }
        Iterator<Map.Entry<User, List<Transport>>> iterator = findUserOldCar.entrySet().iterator();
        while (iterator.hasNext()) {
            List<Transport> list = iterator.next().getValue();
            list.sort(new TransportYearCompratator());
        }
        List<Transport> sortByYear = new ArrayList<>();
        sortByYear.sort(new TransportYearCompratator());
        for(Map.Entry<User, List<Transport>> entry : findUserOldCar.entrySet()) {
            sortByYear.add(entry.getValue().getLast());
        }
        return sortByYear.getLast().getUser();
    }
}








