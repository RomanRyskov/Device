package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BusStop {
    private Queue<String> qu = new LinkedList<>();

    public void addPassenger(String name) {
        qu.offer(name);
        System.out.println(name + " встал в очередь на автобус.");
    }

    public String boardBus() {
        if (qu.isEmpty()) {
            return "Очередь пуста";
        }
        String name = qu.poll();
        return "Следующий пассажир: " + name + " " + name + " сел в автобус.";
    }

    public int getQueueSize() {
        return qu.size();
    }

    public String peekNextPassenger() {
        if (qu.isEmpty()) {
            return "Очередь пустая";
        }
        return qu.element();
    }
}
