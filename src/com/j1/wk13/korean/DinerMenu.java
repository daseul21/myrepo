package com.j1.wk13.korean;

public class DinerMenu implements Menu{
  static final int MAX_ITEMS=6;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu(){
    menuItems= new MenuItem[MAX_ITEMS];
    addItem("steak","tasty and well-done ",false,10.99);
    addItem("fruit salad","fresh fruits  ",true,5.99);
    addItem("soup","appetizer ",false,2.99);
    addItem(toKor("±èÄ¡ººÀ½¹ä"),toKor("ÀÎ±â¸Þ´º "),true,4.99);
    addItem(toKor("Á¦À°ººÀ½"),toKor("¸Ê±â Á¶Àý °¡´É"),false,6.59);
    addItem(toKor("¹ÙÁö¶ô°¥±¹¼ö"),toKor("¹ÙÁö¶ô ±¹³»»ê "),true,5.19);
  }
  public void addItem(String n, String d, boolean v, double p){
  MenuItem menuItem = new MenuItem(n,d,v,p);
  if(numberOfItems>=MAX_ITEMS){
    System.out.println("sorry menu is full");
  }else{
    menuItems[numberOfItems]=menuItem;
    numberOfItems=numberOfItems+1;
  }
  }
  public String toKor(String korean){
   
    try{
      byte[] string = korean.getBytes(); 
      return new String(string,"euc-kr");
    }catch(Exception e){
      e.printStackTrace();
      return null;
    }
  
  }
  
  public MenuItem[] getMenuItems(){
    return menuItems;
  }
  public Iterator createIterator(){
    return new DinerMenuIterator(menuItems);
  }
}