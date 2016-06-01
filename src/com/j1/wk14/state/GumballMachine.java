package com.j1.wk14.state;

public class GumballMachine{
    //final static int SOLD_OUT = 0;
  State soldOutState;
    //final static int NO_QUARTER = 1;
  State noQuarterState;
    //final static int HAS_QUARTER = 2;
  State hasQuarterState;
    //final static int SOLD = 3;
  State soldState;

    //int state = SOLD_OUT;
  State state=soldOutState;
    int count = 0;
  public GumballMachine(int count) {
    soldOutState=new SoldOutState(this);
    noQuarterState=new NoQuarterState(this);
    hasQuarterState=new HasQuarterState(this);
    soldState=new SoldState(this);
        this.count = count;
    
     if (count > 0) {
           // state = NO_QUARTER;
       state=noQuarterState;
       
     }
    }
  public void insertQuarter(){
    state.insertQuarter();
  }
  public void ejectQuarter(){
    state.ejectQuarter();
  }
  public void turnCrank(){
    state.turnCrank();
  }
 
  public void setState(State state){
    this.state=state;
  }
  public State getNoQuarterState(){
    return noQuarterState;
  }
   public State getSoldState(){
    return soldState;
  }
     public State getHasQuarterState(){
    return soldState;
  }
}