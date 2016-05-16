package com.j1.wk11.template;

public class Barista{
  public static void main(String[] args){
    Tea tea = new Tea();
    tea.prepareRecipe();
    Coffee coffee = new Coffee();
    coffee.prepareRecipe();
  }
}