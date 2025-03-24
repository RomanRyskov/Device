package OnlineShop.Model;

import OnlineShop.Enum.TicketType;

public class Ticket {
    private String buyerName;
    private TicketType type;

    public Ticket(String buyerName, TicketType type) {
        this.buyerName = buyerName;
        this.type = type;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public TicketType getType() {
        return type;
    }

}
