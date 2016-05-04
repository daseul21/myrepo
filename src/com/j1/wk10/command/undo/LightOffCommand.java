package com.j1.wk10.command.undo;

import com.j1.wk9.command.*;

 class  LightOffCommand implements Command{
  Light light;
  int level;
  public void execute(){
    level =light.getLevel();
    light.off();
  }
  public void undo(){
   light.dim(level);
  }
  public LightOffCommand(Light light){
    this.light = light;
  }
  
}