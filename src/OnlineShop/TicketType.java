package OnlineShop;

public enum TicketType {
    VIP(1000, "Зал с мягкими седеньями"),
    STANDART (500, "Обычное место"),
    STUDENT(250, "Студенческий билет + скидка");

    private final int price;
    private final String description;

    TicketType(int price, String description){
        this.description = description;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
