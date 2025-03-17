package L13_03_2025;

import L13_03_2025.Comparator.SpeedComparator;
import L13_03_2025.Model.Transport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TransportAnalytics {
   private final List<Transport> transports = new ArrayList<Transport>();


    public List<Transport> filterByYear(int year) {
        List<Transport> filterByYear = new ArrayList<>();
        for (Transport t:transports){
            if (t.getYear() <= year){
                filterByYear.add(t);
            }
        }
        return filterByYear;
    }
}
