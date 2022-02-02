package com.company;

public class Square implements Shape {
    private String shapeName;
    private double side;

    public Square(double side) {
        this.shapeName = "SQAURE";
        this.side = side;
    }

    @Override
    public String getName() {
        return this.shapeName;
    }

    @Override
    public double getBase() {
        return this.side;
    }

    @Override
    public double getHeight() {
        return this.side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.side + this.side);
    }
}
