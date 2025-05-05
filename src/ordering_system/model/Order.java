package ordering_system.model;
import ordering_system.model.num.Status;

import java.util.List;
import java.util.stream.Stream;

public class Order {
    private int id;
    private Customer customer;
    private List<MenuItem> items;
    private Status status;
    private double order_amount;

    public Order(int id, Customer customer, List<MenuItem> order) {
        this.id = id;
        this.customer = customer;
        this.items = items;
        this.status = Status.CREATED;
        this.order_amount = order_sum();
    }

    private double order_sum() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public Status getStatus() {
        return status;
    }

    public double getOrder_amount() {
        return order_amount;
    }
}
