package Shop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        Admin admin = new Admin();
        CustomerFactory cf = new CustomerFactory();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            customers.add(CustomerFactory.next());
            System.out.println(customers.get(i));
        }
        admin.deleteCustomerIndex(customers,3);
        System.out.println(customers.size());
        admin.addCustomerIndex(customers);
        System.out.println(customers.size());
        admin.newProduct(sc);
        System.out.println(Product.productList);
    }
}
