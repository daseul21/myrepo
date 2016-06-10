package com.j1.wk14.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote{
  public int getCount() throws RemoteException;
  public String getLocation() throws RemoteException;
  public State getState() throws RemoteException;
  
  
}
