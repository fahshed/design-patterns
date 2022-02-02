package com.company;

public class ZeroShakeBuilder implements ShakeBuilder {
    private Shake shake;
    private String milkType;
    private String toppingType;

    ZeroShakeBuilder(String milkType, String toppingType) {
        this.shake = new Shake("ZERO", 240);
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
        this.shake.setCreamType("SUGAR FREE JELLO");
    }

    @Override
    public void addSugar() {
        this.shake.setSugarType("SWEETENER");
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