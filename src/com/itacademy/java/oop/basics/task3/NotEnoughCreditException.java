package com.itacademy.java.oop.basics.task3;

public class NotEnoughCreditException extends RuntimeException {
    public NotEnoughCreditException() {
        super("Your credit is too low");
    }
}