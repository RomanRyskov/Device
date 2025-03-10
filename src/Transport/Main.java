package Transport;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        TransportManager tm = new TransportManager();
        for (int i = 0; i < 20; i++) {
            tm.addTransport(TransportFactory.next());
        }
        tm.printAllTransport();
        tm.printUniqueTransport();
        tm.sortTransportByModel();
        tm.printAllTransport();
        tm.printUniqueTransport();
        tm.printAllTransport();
        tm.printUniqueTransport();

    }
}