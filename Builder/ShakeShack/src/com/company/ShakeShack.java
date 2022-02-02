package com.company;

public class ShakeShack {

    private ShakeBuilder shakeBuilder;

    public void produceShake(String[] parameter) {
        if(parameter[0].equals("CHOCOLATE")) shakeBuilder = new ChocolateShakeBuilder(parameter[1],parameter[2]);
        else if(parameter[0].equals("COFFEE")) shakeBuilder = new CoffeeShakeBuilder(parameter[1],parameter[2]);
        else if(parameter[0].equals("STRAWBERRY")) shakeBuilder = new StrawberryShakeBuilder(parameter[1],parameter[2]);
        else if(parameter[0].equals("VANILLA")) shakeBuilder = new VanillaShakeBuilder(parameter[1],parameter[2]);
        else if(parameter[0].equals("ZERO")) shakeBuilder = new ZeroShakeBuilder(parameter[1],parameter[2]);

        this.shakeBuilder.addMilk();
        this.shakeBuilder.addSyrup();
        this.shakeBuilder.addCream();
        this.shakeBuilder.addSugar();
        this.shakeBuilder.addTopping();
    }

    public Shake getShake() {
        return this.shakeBuilder.getShake();
    }
}
