package com.j1.windows;

public class DecoratedWindowTest{
  public static void main(String[] args){
    Window decoratedWindow = new HorizontalScrollBarDecorator(
                                                              new VerticalScrollBarDecorator (new SimpleWindow()));
   System.out.println(decoratedWindow.getDescription());
  }
}