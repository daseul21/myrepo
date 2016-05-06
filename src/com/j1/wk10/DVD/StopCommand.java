package com.j1.wk10.DVD;

public class StopCommand implements Command{
  private DvdPlayer dvd;
  int channel;
  public StopCommand (DvdPlayer dvd){
    this.dvd = dvd;
  }
  public void execute(){
  channel = dvd.getChannel();
    dvd.stop();
  }
  public void undo(){
    dvd.pause(channel);
  }
}