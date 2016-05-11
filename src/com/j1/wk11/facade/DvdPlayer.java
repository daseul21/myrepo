package com.j1.wk11.facade;

public class DvdPlayer{
  DvdPlayer dvd;
  String movieName;
  public void on(){
    System.out.println("DVD player is on..");
  }
  public void off(){
    System.out.println("DVD player is off..");
  }
  public void play(String name){
    movieName=name;
    System.out.println(movieName+" is now on playing!");
  }
  public void stop(){
    System.out.println("movie is stopped.");
  }
  public void eject(){
    System.out.println("ejecting dvd player..");
  }
}