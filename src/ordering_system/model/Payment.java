package ordering_system.model;

import ordering_system.model.num.PaymentMethod;

public class Payment {
    private int payment_id;
    private double payment_amount;
    private PaymentMethod payment_method;

    public Payment(PaymentMethod payment_method, double payment_amount, int payment_id) {
        this.payment_method = payment_method;
        this.payment_amount = payment_amount;
        this.payment_id = payment_id;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public double getPayment_amount() {
        return payment_amount;
    }

    public PaymentMethod getPayment_method() {
        return payment_method;
    }
}
