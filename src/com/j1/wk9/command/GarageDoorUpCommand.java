package com.j1.wk9.command;

public class GarageDoorUpCommand implements Command{
  private GarageDoor gd;
  
  public GarageDoorUpCommand(GarageDoor gd){
    this.gd =gd;
  }
  
  public void execute(){
    gd.up();
  }
}