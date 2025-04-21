package grocery_stream;

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

    public GroceryItem next(){

    }
}

