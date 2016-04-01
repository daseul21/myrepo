package com.j1.wk5.CaramelMacchiato;

public class CaramelMacchiato {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        beverage = new CaramelSauce(beverage);
        beverage = new FoamyMilk(beverage);
        beverage = new SteamedMilk(beverage);
        beverage = new VanillaSyrup(beverage);
        System.out.println(beverage.getDescription() 
                        + " $" + beverage.cost());
 
     
 
    }
}