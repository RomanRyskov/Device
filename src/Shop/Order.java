package Shop;

public class Order {
    private int orderID = 0;
    private int customerID;
    private int productID;
    private int quantity;
    private double FinalPrice;

    public Order(int orderID, int customerID, int productID, int quantity, double FinalPrice) {
        this.customerID = customerID;
        this.productID = productID;
        this.quantity = quantity;
        this.FinalPrice = FinalPrice;
    }
}
