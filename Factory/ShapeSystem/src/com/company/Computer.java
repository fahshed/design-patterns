package com.company;

public abstract class Computer {
    protected String name;
    protected String CPU;
    protected String MMU;
    protected int resolutionHeight ;
    protected int resolutionWidth ;

    public String getName() {
        return name;
    }

    public String getCPU() {
        return CPU;
    }

    public String getMMU() {
        return MMU;
    }

    public void displayShape(Shape shape) {
        boolean fit = false;
        if(shape.getBase() <= this.resolutionWidth && shape.getHeight() <= this.resolutionHeight) {
            fit = true;
        }
        else if(shape.getName().equals("TRIANGLE")) {
            double diagonal = Math.sqrt(Math.pow(this.resolutionHeight,2) + Math.pow(this.resolutionWidth, 2));
            double height = (this.resolutionHeight*this.resolutionWidth)/diagonal;
            if(shape.getBase() <= diagonal && shape.getHeight() <= height) {
                fit = true;
            }
        }

        if(fit) {
            System.out.println("Displaying " + shape.getName());
            System.out.println("Surface Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Resolution: " + this.resolutionHeight + "x" + this.resolutionWidth);
        } else {
            System.out.println("The " + shape.getName() + " is too large for " + this.resolutionHeight + "x" + this.resolutionWidth + " resolution.");
        }
    }
}