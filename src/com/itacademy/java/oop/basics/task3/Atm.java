package com.itacademy.java.oop.basics.task3;

public interface Atm {
    void withdraw(Card card, Double amount);
    void deposit(Card card, Double amount);

    Card findCard(String cardNumber);
}
