package com.j1.wk10.macro;

public class LightOnCommand implements Command{
  Light light;
  public LightOnCommand(Light light){
    this.light = light;
  }
  
  public void execute(){
    light.on();
  }
  public void undo(){
    light.off();
  }
}