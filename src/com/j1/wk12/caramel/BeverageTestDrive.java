package com.j1.wk12.caramel;

public class BeverageTestDrive{
  public static void main(String[] args){
    Coffee coffee = new Coffee();
    System.out.println("Making caramel Macchiato...");
    coffee.prepareRecipe();
    
   CoffeeWithHook coffeeHook = new CoffeeWithHook();
   System.out.println("\n making coffee beverage");
   coffeeHook.prepareRecipe();
  }
}