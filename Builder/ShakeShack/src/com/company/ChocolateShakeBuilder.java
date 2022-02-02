package com.company;

public class ChocolateShakeBuilder implements ShakeBuilder {
    private Shake shake;
    private String milkType;
    private String toppingType;

    ChocolateShakeBuilder(String milkType, String toppingType) {
        this.shake = new Shake("CHOCOLATE", 230);
        this.milkType = milkType;
        this.toppingType = toppingType;
    }

    @Override
    public void addMilk() {
        this.shake.setMilkType(this.milkType);
    }

    @Override
    public void addSyrup() {
        this.shake.setSyrupType("CHOCOLATE SYRUP");
    }

    @Override
    public void addCream() {
        this.shake.setCreamType("CHOCOLATE ICE CREAM");
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
