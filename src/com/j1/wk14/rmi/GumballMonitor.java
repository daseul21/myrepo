package com.j1.wk14.rmi;

import java.rmi.*;

public class GumballMonitor{
  GumballMachineRemote machine;
  public GumballMonitor(GumballMachineRemote machine){
    this.machine=machine;
  }
  public void report(){
    try{
    System.out.println(machine.getLocation());
    System.out.println(machine.getCount());
    System.out.println(machine.getState());
    }catch(RemoteException e){
      e.printStackTrace();
    }
  }

}