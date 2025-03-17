package L13_03_2025.Comparator;

import L13_03_2025.Model.Transport;

import java.util.Comparator;

public class ModelComparator implements Comparator<Transport> {
    @Override
    public int compare(Transport t1, Transport t2) {
        return t1.getModel().compareTo(t2.getModel());
    }
}
