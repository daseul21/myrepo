package com.j1.wk10.command.undo;

public interface Command{
  void execute();
  void undo();
}