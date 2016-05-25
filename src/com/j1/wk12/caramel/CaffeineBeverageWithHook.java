package com.j1.wk12.caramel;

public abstract class CaffeineBeverageWithHook {
 
 void prepareRecipe() {
  boilWater();
  brew();
  pourInCup();
  if (customerWantsCondiments()) {
    addVanilasyrup();
  addMilk();
  addCaramel();
  }
 }
 
 abstract void brew();
 
 abstract void   addVanilasyrup();
  abstract void  addMilk();
  abstract void  addCaramel();
 
 void boilWater() {
  System.out.println("Boiling water");
 }
 
 void pourInCup() {
  System.out.println("Pouring into cup");
 }
 
 boolean customerWantsCondiments() {
  return true;
 }
}