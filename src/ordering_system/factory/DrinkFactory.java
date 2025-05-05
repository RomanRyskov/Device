package ordering_system.factory;

import ordering_system.model.MenuItem;
import ordering_system.model.num.Category;

import java.util.List;
import java.util.Random;

public class DrinkFactory extends MenuItem {
    public DrinkFactory(int id, String name, double price, Category category, boolean flag) {
        super(id, name, price, category, flag);
    }
    private final static Random rand = new Random();
    private final static List<String> namesDrinks = List.of("Лимонад", "Пиво","Кофе","Вода","Чай");

    String name = namesDrinks.get(rand.nextInt(namesDrinks.size()));
    int id  = rand.nextInt(1,100);
    double price = rand.nextDouble(1,10);
    Category category = Category.DRINK;
    boolean flag = rand.nextBoolean();
}
