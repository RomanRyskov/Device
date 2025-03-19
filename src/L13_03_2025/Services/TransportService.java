package L13_03_2025.Services;

import java.util.*;

import L13_03_2025.Comparator.TransportMapKeyComparator;
import L13_03_2025.Model.Transport;
import L13_03_2025.Model.User;


public class TransportService {
    private final List<Transport> transports = new ArrayList<>();


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
        Map<Integer, List<User>> countCar = new HashMap<>();
        for (Transport t : transports) {
            User user =  t.getUser();
            if (user != null) {
                countCar.putIfAbsent(1, new ArrayList<>());
                countCar.get(1).add(user);
            } else {
                countCar.containsValue(user);
            }
        }
        Map<String, List<User>> byCarCount = Map.of("1-2 машины", new ArrayList<>(),
                "3-5 машины", new ArrayList<>(),
                "6 и более машин", new ArrayList<>());
        Iterator<Map.Entry<Integer, List<User>>>  it = countCar.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey() < 3) {
                byCarCount.get("1-2 машины").addAll(it.next().getValue());
            }
            if (it.next().getKey() > 3 && it.next().getKey() < 6) {
                byCarCount.get("3-5 машины").addAll(it.next().getValue());
            }
            if (it.next().getKey() > 6) {
                byCarCount.get("6 и более машин").addAll(it.next().getValue());
            }
        }
        return byCarCount;
    }

    public List<String> findTop5MostPopularBrands() {
        Map<String, Integer> countModel = new HashMap<>();
        List<String> top5Brands = new ArrayList<>();
        for (Transport t : transports) {
            String model = t.getModel();
            countModel.putIfAbsent(t.getModel(), 1);
            if (countModel.containsKey(model)) {
                int count = countModel.get(model);
                countModel.put(model, count + 1);
            }
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(countModel.entrySet());
        entryList.sort(new TransportMapKeyComparator());
        for (int i = 0; i < 5; i++) {
            top5Brands.add(entryList.get(i).getKey());
        }
        return top5Brands;
    }
}



