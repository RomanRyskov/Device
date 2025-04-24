package grocery_stream.manager;

import grocery_stream.model.GroceryItem;
import grocery_stream.num.Category;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroceryManager {
    private List<GroceryItem> groceryItems = new ArrayList<>();

    public void addItem(GroceryItem gi) {
        groceryItems.add(gi);
    }

    public List<GroceryItem> dairyFilter() {
        return groceryItems.stream().filter(groceryItem -> groceryItem.getCategory() == Category.DAIRY).collect(Collectors.toList());
    }

    public List<String> perishableFilter() {
        return groceryItems.stream().filter(GroceryItem::isPerishable).map(GroceryItem::getName).collect(Collectors.toList());
    }

    public List<GroceryItem> sortByPrice() {
        return groceryItems.stream().sorted(Comparator.comparing(GroceryItem::getPrice)).collect(Collectors.toList());
    }

    public List<GroceryItem> sortByPrice2() {
        return groceryItems.stream().sorted(Comparator.comparing(GroceryItem::getPrice)).collect(Collectors.toList()).reversed().subList(0, 3);
    }

    public List<String> top3Names() {
        return sortByPrice2().stream().map(GroceryItem::getName).collect(Collectors.toList());
    }

    public void printWithDiscount() {
        groceryItems.forEach(groceryItem -> System.out.println(groceryItem.getName() + ": " + String.format("%.2f", groceryItem.getPrice() * 0.9) + " Br"));
    }

    public boolean findLessOne() {
        return groceryItems.stream().anyMatch(groceryItem -> groceryItem.getPrice() < 1);
    }

    public boolean allMoreZero() {
        return groceryItems.stream().allMatch(groceryItem -> groceryItem.getPrice() > 0);
    }

    public GroceryItem findFirstVegetable() {
        Optional<GroceryItem> groceryItem = groceryItems.stream().filter(groceryItem1 -> groceryItem1.getCategory() == Category.VEGETABLE).findFirst();
        return groceryItem.get();
    }

    public List<Category> getAllCategory() {
        return groceryItems.stream().map(GroceryItem::getCategory).distinct().collect(Collectors.toList());
    }


    public List<GroceryItem> getGroceryItems() {
        return groceryItems;
    }
}
