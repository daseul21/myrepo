package com.j1.wk7.shape;

public abstract class DrawingAbstractFactory{
  abstract Color getColor(String color);
  abstract Shape getShape(String shpae);
}