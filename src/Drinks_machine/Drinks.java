package Drinks_machine;

public enum Drinks {
    COFFEE(20, 1),
    TEA(10, 2),
    LEMONADE(10, 3),
    COCA_COLA(15, 4),
    WATER(2, 5),
    MINERAL_WATER(5, 6);

    private final int price;
    private final int index_num;

    Drinks(int price, int index_num) {
        this.price = price;
        this.index_num = index_num;
    }

    public int getPrice() {
        return price;
    }
    public int getIndex_num() {
        return index_num;
    }
}
