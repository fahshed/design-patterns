package com.company;

public class Main {

    public static void main(String[] args) {
        ComputerFactory comFactory = new ComputerFactory();

        //Displaying Circle with ComputerA
        Computer computerA = comFactory.getComputer("A");
        Circle circle = new Circle( 10);
        System.out.println("Computer:" + computerA.getName() + " CPU:" + computerA.getCPU() + " MMU:" + computerA.getMMU());
        System.out.println("------------------------------");
        computerA.displayShape(circle);

        //Displaying Square with ComputerC
        Computer computerC = comFactory.getComputer("C");
        Square square = new Square(440);
        System.out.println("\nComputer:" + computerC.getName() + " CPU:" + computerC.getCPU() + " MMU:" + computerC.getMMU());
        System.out.println("------------------------------");
        computerC.displayShape(square);

        //Displaying Triangle with ComputerB
        Computer computerB = comFactory.getComputer("B");
        Triangle triangle = new Triangle(40, 90, 70);
        System.out.println("\nComputer:" + computerB.getName() + " CPU:" + computerB.getCPU() + " MMU:" + computerB.getMMU());
        System.out.println("------------------------------");
        computerB.displayShape(triangle);

        //Displaying Rectangle with ComputerC
        Rectangle rectangle = new Rectangle(4, 9);
        System.out.println("\nComputer:" + computerC.getName() + " CPU:" + computerC.getCPU() + " MMU:" + computerC.getMMU());
        System.out.println("------------------------------");
        computerC.displayShape(rectangle);
    }
}