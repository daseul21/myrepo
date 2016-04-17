package com.j1.wk6.NYstyle;
public class NYPizzaStore extends PizzaStore{
   Pizza createPizza(String type){
     if(type.equals("cheese")){
       return new NYStyleCheesePizza();
     }
     else if(type.equals("veggie")){
       return new NYStyleVeggiePizza();
     }
     else return null;
  }

}