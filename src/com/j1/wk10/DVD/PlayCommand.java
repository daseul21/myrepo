package com.j1.wk10.DVD;

public class PlayCommand implements Command{
  private DvdPlayer dvd;
  int channel;
  public PlayCommand (DvdPlayer dvd){
    this.dvd = dvd;
  }
  public void execute(){
    channel = dvd.getChannel();
    dvd.play();
  }
  public void undo(){
    dvd.pause(channel);
  }
}