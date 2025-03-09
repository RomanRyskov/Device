package Transport;

import java.util.*;


public class TransportManager {
    ArrayList<Transport> transportList = new ArrayList<Transport>();//все трансп средсвта
    Set<Transport> uniqueTransportSet = new HashSet<Transport>();


    void addTransport(List<Transport> ls, Set<Transport> st, Transport t) {
        ls.add(t);
        st.add(t);
    }

    void removeTransport(Transport t) {
        transportList.remove(t);
        uniqueTransportSet.remove(t);
    }

    void sortTransportBySpeed(List<Transport> ls, Set<Transport> st) {
        ls.sort(new speedCamparator());
    }
}