package com.j1.wk13.menu;

import java.util.*;
public class PancakeHouseMenuIterator implements Iterator{
  
  ArrayList items;
  int position=0;
  
  public PancakeHouseMenuIterator(ArrayList items){
    this.items=items;
  }
  public Object next(){
   // MenuItem menuItem=items[position];
    Object object = (Object)items.get(position);
    position++;
    return object;
  
  }
  public boolean hasNext(){
    // if(position >=items.length || items[position]==null){
    if(position>=items.size()){
      return false;
    }else{
      return true;
    }
  }
}