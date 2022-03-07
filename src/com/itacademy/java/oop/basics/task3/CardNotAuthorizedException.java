package com.itacademy.java.oop.basics.task3;

public class CardNotAuthorizedException extends RuntimeException {
    public CardNotAuthorizedException() {
        super("Can't read the card");
    }
}

