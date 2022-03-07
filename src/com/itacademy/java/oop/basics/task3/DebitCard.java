package com.itacademy.java.oop.basics.task3;

public class DebitCard extends Card{
    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
    }

    @Override
    void debit(double amount) {
        if(balance < amount){
            throw new NotEnoughBalanceException();
        }
        balance -= amount;
    }
}
