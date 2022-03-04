package com.itacademy.java.oop.basics.task1;

public class Square extends Shape{
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                " side=" + side +
                ", perimeter=" + calculatePerimeter() +
                ", area=" + calculateArea() +
                '}';
    }

    @Override
    double calculateArea() {
        return side*side;
    }

    @Override
    double calculatePerimeter() {
        return side*4;
    }
}
