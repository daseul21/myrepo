package com.j1.wk13.menu;

public class DinerMenuIterator implements Iterator{
  MenuItem[] items;
  int position=0;
  public DinerMenuIterator(MenuItem[] items){
    this.items=items;
  }
  public Object next(){
    MenuItem menuItem=items[position];
    position++;
    return menuItem;
  }
  public boolean hasNext(){
    if(position >=items.length || items[position]==null){
      return false;
    }else{
      return true;
    }
  }
}