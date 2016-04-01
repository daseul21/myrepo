package com.j1.wk5.CaramelMacchiato;

public class CaramelSauce extends CondimentDecorator {
    
    public CaramelSauce(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", CaramelSauce";
    }
    public double cost() {
        return .20 + beverage.cost();
    }
}