package Transport;


public class Main {
    public static void main(String[] args) {
        TransportManager tm = new TransportManager();
        for (int i = 0; i < 20; i++) {
            tm.addTransport(TransportFactory.next());
        }
        System.out.println(tm.transportByPlate);
        System.out.println(tm.transportByType);
        System.out.println("--------------------------");
        tm.removeTransport("HONDA");
        tm.removeTransport("BMW");
        System.out.println("После удаления по модели: ");
        System.out.println(tm.transportByPlate);
        System.out.println(tm.transportByType);
        System.out.println("--------------------------");
        tm.transportByPlate.put("4455 LW-3", new Car("BMW",125, "4455","Дизель" ));
        tm.findTransportByPlate("4455 LW-3");
        System.out.println("--------------------------");
        tm.findTransportByType("Car");
        System.out.println("--------------------------");
        tm.getFastestTransportByType("Car");
        tm.getFastestTransportByType("Bike");
        tm.getFastestTransportByType("Track");
        tm.printAllTransport();
    }
}