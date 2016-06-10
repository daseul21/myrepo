package com.j1.wk14.rmi;

public class MachineErrorState implements State {  
   
     transient GumballMachine gumballMachine; 
   
     public MachineErrorState(GumballMachine gumballMachine) { 
         this.gumballMachine = gumballMachine; 
     }   
  public void insertQuarter() {  
   System.out.println("cannot insert any quarters");
  }  
    
  public void ejectQuarter() {  
   System.out.println("cannot eject any quarters");
  }  
    
  public void turnCrank() {  
   System.out.println("can't do anything");
  }  
    
 public void dispense() { 
   System.out.println("it's error");
  }  
    
 public String toString() {  
   return "ERROR - system cannot do anything..";  
  }  
 } 
