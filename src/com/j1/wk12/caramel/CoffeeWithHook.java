package com.j1.wk12.caramel;

import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
 
 public void brew() {
  System.out.println("Dripping Coffee through filter");
 }
 
  public void addVanilasyrup(){
    System.out.println("adding vanila syrup");
  }
  public void addMilk(){
   System.out.println("adding milk");
  }
 public  void addCaramel(){
   System.out.println("adding caramel");
  }
 public boolean customerWantsCondiments() {

  String answer = getUserInput();

  if (answer.toLowerCase().startsWith("y")) {
   return true;
  } else {
   return false;
  }
 }
 
 private String getUserInput() {
  String answer = null;

  System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  try {
   answer = in.readLine();
  } catch (IOException ioe) {
   System.err.println("IO error trying to read your answer");
  }
  if (answer == null) {
   return "no";
  }
  return answer;
 }
}