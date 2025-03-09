package Transport;

public class Main {
    public static void main(String[] args) {
        TransportManager tm = new TransportManager();
        for(int i= 0; i<20; i++){
        tm.addTransport(tm.transportList,tm.uniqueTransportSet,TransportFactory.next());}
        System.out.println(tm.transportList);
        System.out.println(tm.transportList.size());
        System.out.println(tm.uniqueTransportSet);
        System.out.println(tm.uniqueTransportSet.size());
        tm.sortTransportBySpeed(tm.transportList,tm.uniqueTransportSet);
        System.out.println(tm.transportList);
    }
}
