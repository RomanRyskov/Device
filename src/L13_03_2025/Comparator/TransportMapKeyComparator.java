package L13_03_2025.Comparator;

import java.util.Comparator;
import java.util.Map;

public class TransportMapKeyComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
        return entry2.getValue().compareTo(entry1.getValue()); // Убывание
    }
}
