package com.company;

public class Rectangle implements Shape {
    private String shapeName;
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.shapeName = "RECTANGLE";
        this.height = height;
        this.width = width;
    }

    @Override
    public String getName() {
        return this.shapeName;
    }

    @Override
    public double getBase() {
        return this.width;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }
}
