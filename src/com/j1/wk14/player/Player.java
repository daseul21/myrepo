package com.j1.wk14.player;

public class Player{
  State playState;
  State sleepState;
  State pauseState;
  
  State state;
  int count=0;
  public Player(int numDvd){
    playState=new PlayState(this);
    sleepState=new SleepState(this);
    pauseState=new PauseState(this);
    this.count=numDvd;
    if(numDvd>0){
      state=playState;
    }
    else
      state=sleepState;
  }
  int getCount(){
    return count;
  }
  
  public void insertDvd(){
    state.insertDvd();
  }
  public void ejectDvd(){
    state.ejectDvd();
    count--;
  }
  public void playVideo(){
    state.playVideo();
  }
  public State getState(){
    return state;
  }
  void setState(State state){
    this.state=state;
  }
  public State getPlayState(){
    return playState;
  }
  public State getPauseState(){
    return pauseState;
  }
  public State getSleepState(){
    return sleepState;
  }
     public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n Daseul KIm, Inc.");

        result.append("\n play list: " + count + " dvd");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("player is " + state + "\n");
        return result.toString();
    }
}