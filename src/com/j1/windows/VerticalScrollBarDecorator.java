package com.j1.windows;

public class VerticalScrollBarDecorator extends WindowDecorator{
  public VerticalScrollBarDecorator(Window windowToBeDecorated){
    super(windowToBeDecorated);
  }
  public void draw(){
    super.draw();
    drawVerticalScrollBar();
  }
  private void drawVerticalScrollBar(){
  }
  public String getDescription(){
    return super.getDescription() +" , including vertical scrollbars";
  }
}