package com.j1.wk14.player;

public class PlayerTestDrive{
  public static void main(String[] args){
    Player p = new Player(2);
    System.out.println(p);
 
    p.insertDvd();
    p.playVideo();
    p.ejectDvd();
    
    System.out.println(p);
  }
}