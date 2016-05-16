package com.j1.wk11.template;
import java.io.*;

public class Coffee extends CaffeineBeverageWithHook{

  
  public void brew(){
    System.out.println("Brewing Coffee");
  }
 
  public void addCondiments(){
    System.out.println("adding sugar and milk");
  }

 public boolean customerWantsCondiments(){
    String answer = getUserInput();
    if(answer.toLowerCase()=="y"){
      return true;
     
    }
    else
      return false;
 
 }
 
 
 public String getUserInput(){
   String answer = null;
   
   System.out.println("Would you like milk and sugar with coffe?(y/n)");
   
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