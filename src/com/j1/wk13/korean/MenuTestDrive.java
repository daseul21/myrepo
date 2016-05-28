package com.j1.wk13.korean;

import java.util.*;

public class MenuTestDrive{
  public static void main(String[] args){
    DinerMenu dinerMenu = new DinerMenu();
    
    Waitress waitress = new Waitress(dinerMenu);
    waitress.printMenu();
  }
}