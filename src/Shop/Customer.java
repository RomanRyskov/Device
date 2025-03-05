package Shop;

import java.util.UUID;

public class Customer {
    private static int customerID;
    private String customerName;
    private String customerLastName;
    private String customerAddress;
    private long customerPhone;
    private String customerEmail;

    public Customer(String customerName, String customerLastName, String customerAddress, long customerPhone, String customerEmail) {
        customerID++;
        this.customerName = customerName;
        this.customerLastName = customerLastName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
    }

    @Override
    public String toString() {
        return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerLastName=" + customerLastName + ", customerAddress=" + customerAddress + ", customerPhone=" + customerPhone + ", customerEmail=" + customerEmail + "]";
    }
}
