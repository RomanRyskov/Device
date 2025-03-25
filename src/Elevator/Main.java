package Elevator;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        elevator.enter("Дима");
        elevator.enter("Саша");
        elevator.enter("Валера");
        elevator.enter("Никита");
        elevator.enter("Маша");
        System.out.println("Из лифта выходит: " + elevator.exit());
        System.out.println("Следующий из лифта выходит: " + elevator.peekNextToExit());
        System.out.println("Сейчас в лифте " + elevator.getCurrentPassenger());
        elevator.exit();

    }
}
