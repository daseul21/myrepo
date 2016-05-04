package com.j1.wk10.command.undo;

import com.j1.wk10.command.*;

public class RemoteLoader{
  public static void main(String[] args){
    RemoteControlWithUndo  rcwu = new RemoteControlWithUndo();
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff = new LightOffCommand(light);
    rcwu.setCommand(0,lightOn,lightOff);
    rcwu.onButtonWasPushed(0);
    rcwu.offButtonWasPushed(0);
  }
}