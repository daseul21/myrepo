package com.j1.wk11.smarthome;

public class PC{
  String subject;
  
  public void on(){
    System.out.println("PC is on..");
  }
  public void off(){
    System.out.println("PC is off..");
  }
  public void playOn(String subject){
    this.subject = subject;
    System.out.println("user is taking "+subject+" online class!");
  }
}