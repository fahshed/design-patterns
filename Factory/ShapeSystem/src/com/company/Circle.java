package com.company;

public class Circle implements Shape {
    private String shapeName;
    private double radius;

    public Circle(double radius) {
        this.shapeName = "CIRCLE";
        this.radius = radius;
    }

    @Override
    public String getName() {
        return this.shapeName;
    }

    @Override
    public double getBase() {
        return 2*this.radius;
    }

    @Override
    public double getHeight() {
        return 2*this.radius;
    }

    @Override
    public double getArea() {
        return 3.1416 * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.1416 * this.radius;
    }
}
