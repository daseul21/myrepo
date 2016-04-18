package com.j1.wk7;

public class PizzaTestDrive{
  public static void main(String[] args){
    Pizza pizza = null;
    PizzaStore chicagoStore = new ChicagoPizzaStore();
    ChicagoStore.orderPizza("cheese");
    pizza.prepare();
    
  }
} 