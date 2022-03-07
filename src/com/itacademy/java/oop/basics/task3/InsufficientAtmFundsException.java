package com.itacademy.java.oop.basics.task3;

public class InsufficientAtmFundsException extends RuntimeException{
    public InsufficientAtmFundsException() {
        super("Your balance is too low");
    }

}

