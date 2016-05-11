package com.j1.wk11.facade;

public class HomeTheaterTestDrive{

  public static void main(String[] args){
  
    Amplifier amp = new Amplifier();
    Tuner tuner =  new Tuner();
    DvdPlayer dvd =  new DvdPlayer();
    Projector projector = new Projector();
    
    HTFacade ht = new HTFacade(amp,tuner,dvd,projector);
    ht.watchMovie("Star wars");
    ht.endMovie();
  }
}