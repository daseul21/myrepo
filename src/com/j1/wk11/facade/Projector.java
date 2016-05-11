package com.j1.wk11.facade;

public class Projector{
  Projector projector;
  
  public void on(){
    System.out.println("projector is on!");
  }
  public void wideScreenMode(){
    System.out.println("screen mode is changed.");
  }
  public void off(){
    System.out.println("projector is off!");
  }
}