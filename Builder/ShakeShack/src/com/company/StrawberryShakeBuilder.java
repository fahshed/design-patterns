package com.company;

public class StrawberryShakeBuilder implements ShakeBuilder {
    private Shake shake;
    private String milkType;
    private String toppingType;

    StrawberryShakeBuilder(String milkType, String toppingType) {
        this.shake = new Shake("STRAWBERRY", 200);
        this.milkType = milkType;
        this.toppingType = toppingType;
    }


    @Override
    public void addMilk() {
        this.shake.setMilkType(this.milkType);
    }

    @Override
    public void addSyrup() {
        this.shake.setSyrupType("STRAWBERRY SYRUP");
    }

    @Override
    public void addCream() {
        this.shake.setCreamType("STRAWBERRY ICE CREAM");
    }

    @Override
    public void addSugar() {
        this.shake.setSugarType("SUGAR");
    }

    @Override
    public void addTopping() {
        this.shake.setToppingType(toppingType);
    }

    @Override
    public Shake getShake() {
        return this.shake;
    }
}