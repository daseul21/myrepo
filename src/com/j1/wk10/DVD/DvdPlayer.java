package com.j1.wk10.DVD;

public class DvdPlayer{
  int channel;
  String playlist;
  public DvdPlayer(String playlist){
    this.playlist = playlist;
  }
  public void play(){
    channel = 10;
    System.out.println("DVD is playing");
  }
  public void stop(){
    channel = 0 ;
    System.out.println("DVD player is stopped");
  }
  public void pause(int channel){
    this.channel = channel;
    if(channel ==0)
      stop();
    else
      System.out.println("DVD is paused.");
  }
  public int getChannel(){
    return channel;
  }
  
}