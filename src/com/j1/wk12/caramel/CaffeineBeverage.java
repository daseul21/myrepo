package com.j1.wk12.caramel;

public abstract class CaffeineBeverage {
   void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
  addVanilasyrup();
  addMilk();
  addCaramel();
  }
abstract void  brew();
abstract void addVanilasyrup();
  abstract void  addMilk();
   abstract void  addCaramel();
  public void boilWater(){
    System.out.println("Boiling water");
  }
  public void pourInCup(){
    System.out.println("Pouring into cup..");
  }
}