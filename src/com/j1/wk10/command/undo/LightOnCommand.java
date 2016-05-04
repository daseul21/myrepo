package com.j1.wk10.command.undo;

import com.j1.wk9.command.*;

 class  LightOnCommand implements Command{
  Light light;
  int level;
  public void execute(){
    level =light.getLevel();
    light.on();
  }
  public void undo(){
   light.dim(level);
  }
  public LightOnCommand(Light light){
    this.light = light;
  }
  
}