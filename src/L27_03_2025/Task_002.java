package L27_03_2025;

import java.util.List;

public class Task_002 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Привет");
        String item = stringBox.getItem();
        System.out.println(item);
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(12);
        Integer item1 = integerBox.getItem();
        System.out.println(item1);

        printTwice("Привет");
        printTwice(1);
        printTwice(integerBox);

        Pair<String, Integer> student = new Pair<>("Дима", 18);
        System.out.println(student.getKey());
        System.out.println(student.getValue());
        List<Integer> integerLis = List.of(1, 2, 3);
        printList(integerLis);

    }

    public static <T> void printTwice(T value) {
        System.out.println(value);
        System.out.println(value);
    }

    public static void printList(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }
}
