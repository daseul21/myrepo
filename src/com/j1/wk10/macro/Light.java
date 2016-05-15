package com.j1.wk10.macro;

public class Light{
  int level;
  String location;
  public Light(String location){
    this.location = location;
  }
  public void on(){
    level=100;
    System.out.println("Light is on.");
  }
  public void off(){
    level=0;
    System.out.println("Light is off.");
  }
  public void dim(int level){
    this.level = level;
    if(level ==0)
      off();
    else
      System.out.println("Light i s dimmed to "+level+"%");
  }
  public int getLevel(){
    return level;
  }
}