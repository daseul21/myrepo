package com.j1.wk14.state;

public class SoldState implements State{
  GumballMachine gumballMachine;
  public SoldState(GumballMachine gumballMachine){
    this.gumballMachine=gumballMachine;
  }
  public void insertQuarter(){
    System.out.println("Please wait, we're already giving you a gumball");
   
  }
  public void ejectQuarter(){
    System.out.println("sorry, you already turned the crank");
   
  }
  public void turnCrank(){
    System.out.println("Turning twice doesn't get you another gumball");
   
  }
  public void dispense(){
    System.out.println("A gumball comes rolling out the slot");
    
  }
}