package com.j1.wk13.state.gumball;

public class GumballMachineTestDrive{
  public static void main(String[] args){
    GumballMachine gm = new GumballMachine(5);
    System.out.println(gm);
    
    gm.insertQuarter();
    gm.turnCrank();
    System.out.println(gm);
    
    gm.insertQuarter();
    gm.ejectQuarter();
    gm.turnCrank();
    
    System.out.println(gm);
    
    
  }
}