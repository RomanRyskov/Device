package bank.num;

public enum Currency {
    USA("Доллар США"),
    RUB("Российский рубль"),
    BYN("Белорусский рубль"),
    EURO("Евро");

    private final String rus;

    Currency(String rus) {
        this.rus = rus;
    }

    public String getRus() {
        return rus;
    }
}

