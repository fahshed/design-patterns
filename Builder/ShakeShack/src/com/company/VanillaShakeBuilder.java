package com.company;

public class VanillaShakeBuilder implements ShakeBuilder {
    private Shake shake;
    private String milkType;
    private String toppingType;

    VanillaShakeBuilder(String milkType, String toppingType) {
        this.shake = new Shake("VANILLA", 190);
        this.milkType = milkType;
        this.toppingType = toppingType;
    }


    @Override
    public void addMilk() {
        this.shake.setMilkType(this.milkType);
    }

    @Override
    public void addSyrup() {
        this.shake.setSyrupType("VANILLA FLAVOURING");
    }

    @Override
    public void addCream() {
        this.shake.setCreamType("JELLO");
    }

    @Override
    public void addSugar() {
        this.shake.setSugarType("SUGAR");
    }

    @Override
    public void addTopping() {
        this.shake.setToppingType(this.toppingType);
    }

    @Override
    public Shake getShake() {
        return this.shake;
    }
}
