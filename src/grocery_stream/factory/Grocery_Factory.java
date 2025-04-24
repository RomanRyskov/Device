package grocery_stream.factory;

import grocery_stream.model.GroceryItem;
import grocery_stream.num.Category;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Grocery_Factory extends GroceryItem {

    public Grocery_Factory(String name, Category category, double price, boolean perishable) {
        super(name, category, price, perishable);
    }

    private static final Random rand = new Random();
    private static final Map<Category, List<String>> map = Map.of(
            Category.DAIRY, List.of("Молоко", "Йогурт"),
            Category.MEAT, List.of("Курица", "Свинина"),
            Category.BAKERY, List.of("Круасан", "Хлеб"),
            Category.BEVERAGE, List.of("Лимонад", "Сок"),
            Category.FRUIT, List.of("Яблоко", "Банан"),
            Category.VEGETABLE, List.of("Салат", "Нут"));

    public static GroceryItem next() {
        Category category = map.keySet().stream()
                .skip(rand.nextInt(map.size()))
                .findFirst()
                .orElseThrow();
        String name = map.get(category).stream()
                .skip(rand.nextInt(map.get(category).size()))
                .findFirst()
                .orElseThrow();
        double price = rand.nextInt(100);
        boolean perishable = rand.nextBoolean();
        return new GroceryItem(name, category, price, perishable);
    }
}

