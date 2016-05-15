package com.j1.wk11.smarthome;

public class SmartHomeTestDrive{
  public static void main(String[] args){
    Desk desk = new Desk();
    PC pc = new PC();
    Light light = new Light();
    
    SmartHomeFacade smartHome = new SmartHomeFacade(desk,pc,light);
    smartHome.beginStudy("English");
    smartHome.endStudy();
  }
}