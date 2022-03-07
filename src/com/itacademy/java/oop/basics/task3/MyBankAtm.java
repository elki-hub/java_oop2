package com.itacademy.java.oop.basics.task3;

import java.util.Objects;

public class MyBankAtm implements Atm{
    private final double balance;
    private Card[] cards;

    public MyBankAtm(double balance, Card[] cards) {
        this.balance = balance;
        this.cards = cards;
    }

    @Override
    public void withdraw(Card card, Double amount) {
        if(balance - amount < 0){
            throw new InsufficientAtmFundsException();
        }
        card.debit(amount);
    }

    @Override
    public void deposit(Card card, Double amount) {
        card.credit(amount);
    }
    
    public Card findCard(String cardNumber){
        for(Card card: cards){
            if(Objects.equals(card.getCardNumber(), cardNumber)){
                return card;
            }
        }
        throw new CardNotAuthorizedException();
    }

}
