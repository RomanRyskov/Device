package Transport;

import java.util.Comparator;

public class modelComparator implements Comparator<Transport> {
    @Override
    public int compare(Transport t1, Transport t2) {
        return t1.getModel().compareTo(t2.getModel());
    }
}
