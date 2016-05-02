package com.j1.wk9.command;

public class RemoteControlTest{
  public static void main(String[] args){
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    GarageDoor garage = new GarageDoor();
    GarageDoorUpCommand garageup = new GarageDoorUpCommand(garage);
    remote.setCommand(lightOn);
    remote.buttonPressed();
    
    remote.setCommand(garageup);
    remote.buttonPressed();
  }
}