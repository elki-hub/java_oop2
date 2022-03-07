package com.itacademy.java.oop.basics.task3;

public class NotEnoughBalanceException extends RuntimeException {
    public NotEnoughBalanceException() {
        super("Your balance is too low");
    }
}
