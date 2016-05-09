package com.j1.wk10.adapter.enumeration;

import java.util.*;

public class IteratorEnumeration implements Enumeration {
  Iterator iterator;
  public IteratorEnumeration(Iterator iterator){
    this.iterator = iterator;
  }
  public boolean hasMoreElements(){
    return iterator.hasNext();
  }
  public Object nextElement(){
    return iterator.next();
  }
}
