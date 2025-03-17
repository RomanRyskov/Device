package L13_03_2025.Services;

import java.util.*;

import L13_03_2025.Comparator.TransportMapValueComparator;
import L13_03_2025.Model.Transport;
import L13_03_2025.User;


public class TransportService {
    private final List<Transport> transports = new ArrayList<>();
    private Map<Integer, User> countCar = new HashMap<>();


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
    public List<String> findTop5MostPopularBrands(){
        Map<String,Integer> countModel = new HashMap<>();

        for(Transport t:transports){
            int count = 1;
            String model = t.getModel();
            countModel.putIfAbsent(t.getModel(),count);
            if(countModel.containsKey(model)){
                Integer sizeModel = countModel.get(model);
                countModel.put(model, ++sizeModel);
            }

        }
        return null;
    }
}

