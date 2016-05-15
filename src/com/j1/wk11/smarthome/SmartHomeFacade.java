package com.j1.wk11.smarthome;

public class SmartHomeFacade{
  private Desk desk;
  private PC pc;
  private Light light;
  
  public SmartHomeFacade(Desk desk, PC pc, Light light){
    this.desk = desk;
    this.pc = pc;
    this.light = light;
  }

  public void beginStudy(String subject){
    System.out.println("get ready to study..");
    light.on();
    desk.organize();
    desk.setPC();
    pc.on();
    pc.playOn(subject);
  }
  
  public void endStudy(){
    pc.off();
    desk.cleanUp();
    light.off();
  
  }
}