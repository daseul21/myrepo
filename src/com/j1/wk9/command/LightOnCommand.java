package com.j1.wk9.command;

public class LightOnCommand implements Command{
  private Light light;
  LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
    light.on();
  }
}