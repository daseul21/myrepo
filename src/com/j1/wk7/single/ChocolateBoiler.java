package com.j1.wk7.single;

public class ChocolateBoiler{
  private static ChocolateBoiler uniqueInstance;
  private boolean empty;
  private boolean boiled;
  private ChocolateBoiler(){
    empty=true;
    boiled=false;
  }
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance==null){
      uniqueInstance= new ChocolateBoiler();
      
    }
    return uniqueInstance;
  }
  public void fill(){
    if(empty){
      empty=false;
      boiled=false;
    }
  }
}