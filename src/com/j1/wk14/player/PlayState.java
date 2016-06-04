package com.j1.wk14.player;

import java.util.Random;
public class PlayState implements State{
  Player player;
  
  public PlayState(Player player){
    this.player=player;
  }
  public void insertDvd(){
    System.out.println("You already inserted another DVD");
  }
  public void ejectDvd(){
    System.out.println("DVD returned..");
  }
  public void playVideo(){
    System.out.println("Now video is playing");
  }
  public void display(){
    System.out.println("watch full HD Video.."); 
  }
  public String toString(){
    return "playing video ";
  }
}