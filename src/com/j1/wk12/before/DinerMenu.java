package com.j1.wk12.before;

public class DinerMenu{
  MenuItem[] menuItems;
  int numberOfItems=0;
  static final int MAX_ITEMS =3;
  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.9);
    addItem("Vegetarian BLT","(Fakin')Bacon with lettuce & tomato on whole wheat",true,2.9);
    addItem("Soup of the day","soup with a side of potato salad",false,3.29);
  }
  
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem = new MenuItem(name, description,v,p);
    if(numberOfItems>=MAX_ITEMS){
      System.err.println("Error");
    }else{
      menuItems[0]=menuItem;
      numberOfItems++;
    }
    
    
  }
}