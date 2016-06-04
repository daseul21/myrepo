package com.j1.wk14.player;

public class PauseState implements State{
  Player player;
  
  public PauseState(Player player){
    this.player=player;
  }
  public void insertDvd(){
    System.out.println("You already inserted another DVD");
  }
  public void ejectDvd(){
    System.out.println("DVD returned..");
  }
  public void playVideo(){
    System.out.println("Video playing is stopped");
  }
  public void display(){
    System.out.println("display off"); 
  }
  public String toString(){
    return "video paused";
  }
}