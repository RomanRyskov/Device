package L13_03_2025.Comparator;

import java.util.Comparator;
import java.util.Map;

public class TransportMapKeyComparator implements Comparator<Map.Entry<Integer, String>> {

    @Override
    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        return o1.getKey() - o2.getKey();
    }
}
