package L13_03_2025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TransportAnalytics {
    List<Transport> transports = new ArrayList<Transport>();


    public List<Transport> filterByYear(int year) {
        Iterator<Transport> itr = transports.iterator();
        while (itr.hasNext()) {
            Transport t = itr.next();
            if (t.getYear() > year) {
                itr.remove();
            }
        }
        return transports;
    }
    public List<Transport> findTop3Fastest(){
        transports.sort(new SpeedComparator());
        Iterator<Transport> itr = transports.iterator();
        int count = 1;
        while (itr.hasNext()) {
            Transport t = itr.next();
            if (count > 3) {
                itr.remove();
                count++;
            }
        }
        return transports;
    }
}
