package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(6);

        System.out.println(circle);
        System.out.println(square);
    }
}
