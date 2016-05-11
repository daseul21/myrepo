package com.j1.wk11.facade;

public class HTFacade{
  private Tuner tuner;
  private Amplifier amp;
  private DvdPlayer dvd;
  private Projector projector;
  public HTFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, Projector projector){
    this.amp = amp;
    this.tuner= tuner;
    this.dvd = dvd;
    this.projector = projector;
  }
  public void watchMovie(String movie){
    System.out.println("Get ready to watch a movie..");
    projector.on();
      //�����ڿ� �־���� ���� �̸� �־� ���� ��! 
    projector.wideScreenMode();
    amp.on();
    amp.setDvd(dvd);
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }
  
  public void endMovie(){
    System.out.println("Shutting off..");
    projector.off();
    amp.off();
    dvd.stop();
    dvd.eject();
    dvd.off();
  }
}