package com.j1.wk10.adapter;

public class TurkeyTestDrive{
  public static void main(String[] args){
    MallardDuck duck = new MallardDuck();
    DuckAdapter da = new DuckAdapter(duck);
    testTurkey(da);
 
  }
  
  static void testTurkey(Turkey turkey){
    turkey.gobble();
  }
}