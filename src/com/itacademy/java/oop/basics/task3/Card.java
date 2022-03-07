package com.itacademy.java.oop.basics.task3;

public abstract class Card {
    protected double balance;
    private final String CARD_HOLDER_NAME;
    private final String CARD_NUMBER;

    public Card(double balance, String CARD_HOLDER_NAME, String CARD_NUMBER) {
        this.balance = balance;
        this.CARD_HOLDER_NAME = CARD_HOLDER_NAME;
        this.CARD_NUMBER = CARD_NUMBER;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardHolderName() {
        return CARD_HOLDER_NAME;
    }

    public String getCardNumber() {
        return CARD_NUMBER;
    }

    void credit(double amount){
        balance += amount;
    }
    abstract void debit(double amount);
}
