package com.j1.wk7.single;

public class SingletonMain{
  public static void main(String[] args){
    Singleton s1= Singleton.getInstance();
    Singleton s2= Singleton.getInstance();
  }
}