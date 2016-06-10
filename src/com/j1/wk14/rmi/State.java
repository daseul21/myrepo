package com.j1.wk14.rmi;

import java.io.Serializable;

public interface State extends Serializable{
  public void insertQuarter();
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
}