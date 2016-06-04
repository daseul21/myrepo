package com.j1.wk14.player;

public class SleepState implements State{
  Player player;
  
  public SleepState(Player player){
    this.player=player;
  }
  public void insertDvd(){
    System.out.println("You inserted DVD");
  }
  public void ejectDvd(){
    System.out.println("You can't eject, you have not inseted any dvd");
  }
  public void playVideo(){
    System.out.println("You press button , but there's no dvd");
  }
  public void display(){
    System.out.println("display off"); 
  }
  public String toString(){
    return "sleep mode";
  }
}