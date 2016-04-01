package com.j1.wk5.CaramelMacchiato;

public class SteamedMilk extends CondimentDecorator {
    
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", SteamedMilk";
    }
    public double cost() {
        return .25 + beverage.cost();
    }
}