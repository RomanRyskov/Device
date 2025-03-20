package Queue;

public class Main {
    public static void main(String[] args) {
        BusStop bs = new BusStop();
        bs.addPassenger("Петя");
        bs.addPassenger("Вова");
        bs.addPassenger("Дима");
        System.out.println(bs.boardBus());
        System.out.println("Всего в очереди: " + bs.getQueueSize());
        System.out.println("Следующий в очереди: " + bs.peekNextPassenger());
        System.out.println(bs.boardBus());
        System.out.println(bs.boardBus());
        System.out.println("Следующий в очереди: " + bs.peekNextPassenger());
    }
}
