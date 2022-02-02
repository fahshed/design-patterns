package com.company;

public class Shake implements ShakePlan {
    private String shakeType;
    private String milkType;
    private String syrupType;
    private String creamType;
    private String sugarType;
    private String toppingType;
    private int price;

    public Shake(String shakeType, int price) {
        this.shakeType = shakeType;
        this.milkType = milkType;
        this.syrupType = null;
        this.creamType = null;
        this.sugarType = null;
        this.toppingType = null;
        this.price = price;

        System.out.println(shakeType + " SHAKE\t" + price + "Tk");
        System.out.println("----------------------------------");
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;

        System.out.print("ADDED MILK");

        if(milkType.equals("LACTOSE-FREE")) {
            price = price + 60 ;
            System.out.print("\t+60Tk (LACTOSE-FREE ALMOND MILK)");
        }

        System.out.println(" ");
    }

    public void setSyrupType(String syrupType) {
        this.syrupType = syrupType;
        System.out.println("ADDED " + this.syrupType);
    }

    public void setCreamType(String creamType) {
        this.creamType = creamType;
        System.out.println("ADDED " + this.creamType);
    }

    public void setSugarType(String sugarType) {
        this.sugarType = sugarType;
        System.out.println("ADDED " + this.sugarType);
    }

    public void setToppingType(String toppingType) {
        this.toppingType = toppingType;

        if (this.toppingType.equals("CANDY")) {
            price = price + 50;
            System.out.println("ADDED TOPPING\t+50Tk (CANDY)");
        } else if (this.toppingType.equals("COOKIE")) {
            price = price + 40;
            System.out.println("ADDED TOPPING\t+40Tk (COOKIE)");
        }

    }

    public int getPrice() {
        return price;
    }
}