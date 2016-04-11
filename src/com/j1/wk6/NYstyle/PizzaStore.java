package com.j1.wk6.NYstyle;

/*
public class PizzaStore{
  SimplePizzaFactory factory;
  public PizzaStore(SimplePizzaFactory factory){
    this.factory = factory;
  }
  public Pizza orderPizza(String type){
    Pizza pizza = factory.createPizza(type);
    pizza.prepare();
  }
}*/

public abstract class PizzaStore{
  abstract Pizza createPizza(String type);
  public Pizza orderPizza(String type){
    Pizza pizza = createPizza(type);
    pizza.Prepare();
    pizza.Bake();
    pizza.Cut();
    pizza.Box();
    
    return pizza;
  }
}
