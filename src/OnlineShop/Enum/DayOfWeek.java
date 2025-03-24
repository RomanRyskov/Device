package OnlineShop.Enum;

public enum DayOfWeek {
    MONDAY(0),
    TUESDAY(10),
    WEDNESDAY(15),
    THURSDAY(20),
    FRIDAY(20),
    SATURDAY(20),
    SUNDAY(20);

    private final int discountPercent;

    DayOfWeek(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}


