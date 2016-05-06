package com.j1.wk10.DVD;

public class RemoteLoader{
  public static void main(String[] args){
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    DvdPlayer d = new DvdPlayer("movie");
    PlayCommand d1= new PlayCommand(d);
    StopCommand d2 = new StopCommand(d);
    
    remote.setCommand(0,d1,d2);
    remote.playButtonWasPushed(0);
    remote.stopButtonWasPushed(0);
    remote.undoButtonWasPushed();
    remote.stopButtonWasPushed(0);
    remote.playButtonWasPushed(0);
  }
}