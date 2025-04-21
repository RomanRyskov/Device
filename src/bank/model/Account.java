package bank.model;

import bank.num.Currency;

public class Account {
    private String accountNumber;
    private double balance;
    Currency currency;
    private String clientId;

    public Account(String accountNumber, double balance, Currency currency, String clientId) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
        this.clientId = clientId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }
}
