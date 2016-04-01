package com.j1.wk5.CaramelMacchiato;

public class VanillaSyrup extends CondimentDecorator {
    
    public VanillaSyrup(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", VanillaSyrup";
    }
    public double cost() {
        return .25 + beverage.cost();
    }
}