package L13_03_2025;


import L13_03_2025.Factory.TransportFactory;
import L13_03_2025.Services.TransportService;
import Transport.Transport;
import Transport.TransportManager;


public class Main {
    public static void main(String[] args) {
        TransportService ts = new TransportService();
        for(int i = 0; i<100; i++) {
            ts.getTransports().add(TransportFactory.next());
        }
        System.out.println(ts.getTransports());
        System.out.println(ts.findTop5MostPopularBrands());
        System.out.println(ts.groupOwnersByCarCount());
    }
}
