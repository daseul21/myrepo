package com.j1.wk5.CaramelMacchiato;

public class FoamyMilk extends CondimentDecorator {
    
    public FoamyMilk(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", FoamyMilk";
    }
    public double cost() {
        return .15 + beverage.cost();
    }
}