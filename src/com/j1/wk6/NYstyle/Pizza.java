package com.j1.wk6.NYstyle;

public abstract class Pizza{
  String name;
  void Prepare(){
    
  }
  void Bake(){
    System.out.println("Baking...");
  }
  void Cut(){
    System.out.println("Cutting...");
  }
  void Box(){
    System.out.println("Boxing...");
  }
  
  public String getName(){
    return name;
  }
}