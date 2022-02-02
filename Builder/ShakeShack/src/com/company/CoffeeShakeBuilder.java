package com.company;

public class CoffeeShakeBuilder implements ShakeBuilder {
    private Shake shake;
    private String milkType;
    private String toppingType;

    CoffeeShakeBuilder(String milkType, String toppingType) {
        this.shake = new Shake("COFFEE", 230);
        this.milkType = milkType;
        this.toppingType = toppingType;
    }

    @Override
    public void addMilk() {
        this.shake.setMilkType(this.milkType);
    }

    @Override
    public void addSyrup() {
        this.shake.setSyrupType("COFFEE");
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
