package com.company;

public class ComputerFactory {

    public Computer getComputer(String computerName) {
        if(computerName == null) {
            return null;
        }
        if(computerName.equals("A")) {
            return new ComputerA();
        }
        if(computerName.equals("B")) {
            return new ComputerB();
        }
        if(computerName.equals("C")) {
            return new ComputerC();
        }

        return null;
    }
}
