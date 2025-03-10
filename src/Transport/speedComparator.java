package Transport;

import java.util.Comparator;

public class speedComparator implements Comparator<Transport> {
    @Override
    public int compare(Transport t1, Transport t2) {
        return t1.getSpeed()-t2.getSpeed();
    }

}

