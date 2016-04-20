package com.j1.wk7.single;

public class ChocolateMain{
  public static void main(String[] args){
    ChocolateBoiler boiler=ChocolateBoiler.getInstance();
    boiler.fill();
    ChocolateBoiler boiler2=ChocolateBoiler.getInstance();
  }
}