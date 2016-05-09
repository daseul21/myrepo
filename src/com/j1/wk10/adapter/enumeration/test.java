package com.j1.wk10.adapter.enumeration;

import java.util.*;

public class test{
  public static void main(String[] args){
    ArrayList l = new ArrayList(Arrays.asList(args));
    Enumeration enumeration  = new IteratorEnumeration(l.iterator());
    while(enumeration.hasMoreElements())
      System.out.println(enumeration.nextElement());
  }
}