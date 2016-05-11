package com.j1.wk11.facade;

public class Amplifier{
  Amplifier amp;
  DvdPlayer dvd;
  
  int volume;
  public void on(){
    System.out.println("amplifier is on.");
  }
  public void off(){
    System.out.println("amplifier is off.");
  }
  public void setDvd(DvdPlayer dvd){
    this.dvd = dvd;
  }
  public void setVolume(int volume){
    this.volume = volume;
  }
  
}