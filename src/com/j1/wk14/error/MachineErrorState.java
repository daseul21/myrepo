package com.j1.wk14.error;

public class MachineErrorState implements State {
 
    GumballMachine gumballMachine;
 
    public MachineErrorState (GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
 public void insertQuarter() {

 }
 
 public void ejectQuarter() {

 }
 
 public void turnCrank() {

 }
 
 public void dispense() {
 
 }
 
 public String toString() {
  return "ERROR - system cannot do anything..";
 }
}