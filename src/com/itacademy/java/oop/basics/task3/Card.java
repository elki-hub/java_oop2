package com.itacademy.java.oop.basics.task3;

public abstract class Card {
    protected double balance;
    private final String cardHolderName;
    private final String cardNumber;

    public Card(double balance, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    void credit(double amount){
        balance += amount;
    }
    abstract void debit(double amount);
}
