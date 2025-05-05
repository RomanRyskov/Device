package ordering_system.model;
import ordering_system.model.num.Category;

import java.util.Objects;

public class MenuItem {
    private int id;
    private String name;
    private double price;
    private Category category;
    private boolean flag;

    public MenuItem(int id, String name, double price, Category category, boolean flag) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isFlag() {
        return flag;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return id == menuItem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", flag=" + flag +
                '}';
    }
}
