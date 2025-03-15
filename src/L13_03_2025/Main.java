package L13_03_2025;


public class Main {
    public static void main(String[] args) {
        TransportManager tm = new TransportManager();
        for (int i = 0; i < 20; i++) {
            tm.addTransport(TransportFactory.next());
        }
        System.out.println(tm.transportByPlate);
        System.out.println(tm.transportByType);
        System.out.println("--------------------------");
        tm.addTransport( new Car("BMW",125, "4455 LW-3",2025,"Дизель" ));
        System.out.println(tm.transportByPlate);
        System.out.println(tm.transportByType);
        System.out.println("--------------------------");
        System.out.println(tm.findTransportByPlate("4455 LW-3"));
        tm.removeTransport("4455 LW-3");
        System.out.println(tm.transportByType);
        System.out.println(tm.findTransportByPlate("4455 LW-3"));
        System.out.println("--------------------------");
        System.out.println(tm.findTransportByType("Car"));
        System.out.println("--------------------------");
        System.out.println(tm.getFastestTransportByType("Car"));
        System.out.println("--------------------------");
        System.out.println(tm.transportByType);
        tm.printAllTransport();
    }
}