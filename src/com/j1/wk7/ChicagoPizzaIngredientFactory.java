package com.j1.wk7;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
  public Dough createDough(){
    return new ThickCrustDough();
  }
  public Cheese createCheese(){
    return new MozzarellaCheese();
  }
}