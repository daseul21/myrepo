package com.j1.wk9.command;

public class SimpleRemoteControl{
  private Command slot;
  
  void  setCommand(Command slot){
    this.slot = slot;
  }
  public void buttonPressed(){
    slot.execute();
  }
}