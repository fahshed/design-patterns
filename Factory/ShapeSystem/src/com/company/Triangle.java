package com.company;

import java.lang.Math;

public class Triangle implements Shape {
    private String shapeName;
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.shapeName = "TRIANGLE";
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String getName() {
        return this.shapeName;
    }

    @Override
    public double getBase() {
        return Math.max(Math.max(this.side1, this.side2), this.side3);
    }

    @Override
    public double getHeight() {
        return this.getArea() / this.getBase();
    }

    @Override
    public double getArea() {
        double s = this.getPerimeter()/2;
        return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
}