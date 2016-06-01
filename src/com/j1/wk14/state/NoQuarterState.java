package com.j1.wk14.state;

public class NoQuarterState implements State{
  GumballMachine gumballMachine;
   public NoQuarterState(GumballMachine gumballMachine){
    this.gumballMachine=gumballMachine;
  }
  public void insertQuarter(){
    System.out.println("You insert a quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }
  public void ejectQuarter(){
    System.out.println("you cannot eject quarter");
   
  }
  public void turnCrank(){
    System.out.println("You turned but there's no quarter");
   
  }
  public void dispense(){
    System.out.println("you need to pay first");
    
  }
}