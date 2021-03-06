package com.j1.wk10.DVD;

public class RemoteControlWithUndo{
  Command[] stopCommands;
  Command[] playCommands;
  Command undoCommand;
  public RemoteControlWithUndo(){
    stopCommands = new Command[7];
    playCommands = new Command[7];
    
    Command noCommand = new NoCommand();
    for(int i=0; i<7; i++){
      playCommands[i]=noCommand;
      stopCommands[i]=noCommand;
    }
    
    undoCommand = noCommand;
  }
  
  public void setCommand(int slot,Command playCommand, Command stopCommand){
    playCommands[slot] = playCommand;
    stopCommands[slot] = stopCommand;
  }
  public void playButtonWasPushed(int slot){
    playCommands[slot].execute();
    undoCommand = playCommands[slot];
  }
  public void stopButtonWasPushed(int slot){
    stopCommands[slot].execute();
    undoCommand = stopCommands[slot];
  }
  public void undoButtonWasPushed(){
    undoCommand.undo();
  }

}