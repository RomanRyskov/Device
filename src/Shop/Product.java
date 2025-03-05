package Shop;

import java.util.ArrayList;
import java.util.List;

public class Product {
    static List<Product> productList = new ArrayList<Product>();
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Товар ='" + productName + '\'' +
                ", цена =" + price +
                ", количество на складе =" + quantity +
                '}';
    }
}
