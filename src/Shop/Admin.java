package Shop;

import java.util.*;

public class Admin {
    public void deleteCustomerIndex(List<Customer> ls, int index) {
        ls.remove(index);
    }

    public void addCustomerIndex(List<Customer> ls) {
        ls.add(CustomerFactory.next());
    }

    public static void newProduct(Scanner scanner) {
        System.out.println("Название товара: ");
        String name =  scanner.next();
        System.out.println("Введите цену нового товара");
        Double price =  scanner.nextDouble();
        System.out.println("Введите колчевство на складе");
        int quantity = scanner.nextInt();
        Product pr = new Product(name, price, quantity);
        Product.productList.add(pr);
    }
}
