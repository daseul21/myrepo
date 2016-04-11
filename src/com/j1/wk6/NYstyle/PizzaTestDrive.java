package com.j1.wk6.NYstyle;




public class PizzaTestDrive{

  public static void main(String[] args){
    PizzaStore nyStore = new NYPizzaStore();
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("order name : "+ pizza.getName());
  }
}