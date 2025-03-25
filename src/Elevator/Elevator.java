package Elevator;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
    private final int maxCapacity = 6;
    Queue<String> elevator = new LinkedList<>();

    public void enter   (String person) {
        if (isFull()) {
            System.out.println("Нету места, лифт полный");
        } else {
            elevator.offer(person);
            System.out.println(person + " вошел в лифт.");
        }
    }

    public String exit() {
        if (elevator.isEmpty()) {
            return "лифт пустой";
        } else {
            return elevator.poll();
        }
    }
    public int getCurrentPassenger(){
        return elevator.size();
    }
    public String peekNextToExit(){
        if (elevator.isEmpty()) {
            return "Лифт пустой";
        }
        return elevator.peek();
    }
    public boolean isFull(){
        return elevator.size() >= maxCapacity;
    }

}
