package com.j1.wk5.CaramelMacchiato;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}