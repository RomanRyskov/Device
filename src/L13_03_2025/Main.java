package L13_03_2025;


public class Main {
    public static void main(String[] args) {
        TransportManager tm = new TransportManager();
        TransportAnalytics ta = new TransportAnalytics();
        for (int i = 0; i < 100; i++) {
            ta.transports.add(TransportFactory.next());
        }
        System.out.println(ta.transports.size());
        ta.filterByYear(2020);
        System.out.println(ta.transports.size());
        System.out.println (ta.findTop3Fastest());
    }
}