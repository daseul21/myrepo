package com.j1.window;

public class HorizontalScrollBarDecorator extends WindowDecorator{
  public HorizontalScrollBarDecorator (Window windowToBeDecorated){
    super(windowToBeDecorated);
  }
  public void draw(){
    super.draw();
    drawHorizontalScrollBar();
  }
  private void drawHorizontalScrollBar(){
  
  }
  public String getDescription(){
    return super.getDescription()+", including horizontal scrollbars";
  }
}