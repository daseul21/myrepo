package com.j1.wk11.template;
import java.io.*;

public class Tea extends CaffeineBeverageWithHook{

  public void brew(){
  
  System.out.println("steeping tea bags");
  }

  public void addCondiments(){
    System.out.println("add Lemon!");
  }
  
  public boolean customerWantsCondiments(){
    String answer = getUserInput();
    if(answer.toLowerCase()=="y")
      return true;
    else
      return false;
 
 }
 
 
 public String getUserInput(){
   String answer = null;
   
   System.out.println("Would you like lemon with tea?(y/n)");
   
   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   
   try{
     answer= in.readLine();
   }catch(IOException ioe){
   }
   
   if(answer==null){
     return "no";
   }
   return answer;
 
 }
}