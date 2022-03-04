package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                ", perimeter=" + calculatePerimeter() +
                ", area=" + calculateArea() +
                '}';
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}
