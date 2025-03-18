package L13_03_2025.Services;

import java.util.*;

import L13_03_2025.Comparator.TransportMapKeyComparator;
import L13_03_2025.Model.Transport;
import L13_03_2025.User;

import javax.imageio.ImageTranscoder;


public class TransportService {
    private List<Transport> transports = new ArrayList<>();
    private Map<Integer, User> countCar = new HashMap<>();

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
        Iterator<Map.Entry<Integer, User>> it = countCar.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey() < 3) {
                byCarCount.get("1-2 машины").add(it.next().getValue());
            }
            if (it.next().getKey() > 3 && it.next().getKey() < 6) {
                byCarCount.get("3-5 машины").add(it.next().getValue());
            }
            if (it.next().getKey() > 6) {
                byCarCount.get("6 и более машин").add(it.next().getValue());
            }
        }
        return byCarCount;
    }

    public List<String> findTop5MostPopularBrands() {
        Map<String, Integer> countModel = new HashMap<>();
        List<String> top5Brands = new ArrayList<>();
        for (Transport t : transports) {
            int count = 1;
            String model = t.getModel();
            countModel.putIfAbsent(t.getModel(), count);
            if (countModel.containsKey(model)) {
                Integer sizeModel = countModel.get(model);
                countModel.put(model, ++sizeModel);
            }
        }
        int maxValue = 0;
        for (Map.Entry<String, Integer> entry : countModel.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }
            for (int i = 0; i < 5; i++) {
                Iterator<Map.Entry<String, Integer>> it = countModel.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue() == maxValue) {
                        top5Brands.add(entry.getKey());
                    }
                }
                if (top5Brands.size() > 5) {
                    break;
                }
                maxValue --;
            }
        }
        return top5Brands;
    }

}

