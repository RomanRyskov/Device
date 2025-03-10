package Transport;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        TransportManager tm = new TransportManager();
        for (int i = 0; i < 20; i++) {
            tm.addTransport(TransportFactory.next());
        }
        System.out.println(tm.transportList);
        System.out.println(tm.uniqueTransportSet);
        System.out.println(tm.uniqueTransportSet.size());
        tm.sortTransportBySpeed();
        System.out.println(tm.uniqueTransportSet);
        System.out.println(tm.uniqueTransportSet.size());
        tm.sortTransportByModel();
        System.out.println(tm.uniqueTransportSet);
        System.out.println(tm.uniqueTransportSet.size());
    }
}