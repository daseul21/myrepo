package com.j1.wk7.shape;

public class DrawingTest{
  public static void main(String[] args){
    DrawingAbstractFactory fac = new ShapeFactory();
    Shape s = fac.getShape("Circle");
    s.show();
    fac = new ColorFactory();
    Color c = fac.getColor("red");
    c.fill();
  }
}