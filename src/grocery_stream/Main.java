package grocery_stream;

import grocery_stream.factory.Grocery_Factory;
import grocery_stream.manager.GroceryManager;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        GroceryManager manager = new GroceryManager();
        IntStream.range(0, 20) // Генерируем стрим чисел от 0 до 19
                .forEach(i -> manager.addItem(Grocery_Factory.next()));
        System.out.println(manager.getGroceryItems());
        System.out.println(manager.dairyFilter());
        System.out.println(manager.perishableFilter());
        System.out.println(manager.sortByPrice());
        System.out.println(manager.sortByPrice2());
        System.out.println(manager.top3Names());
        manager.printWithDiscount();
        System.out.println(manager.findLessOne());
        System.out.println(manager.allMoreZero());
        System.out.println(manager.findFirstVegetable());
        System.out.println(manager.getAllCategory());
    }

}
