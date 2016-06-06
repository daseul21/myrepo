package com.j1.wk14.address;

public class BookDAO{
  public static void main(String[] args){
    AddressBookDao dao= new AddressBookDaoImpl();
    
    for(AddressBook adb : dao.getAll()){
      System.out.println("Name : "+adb.getName()+" Phone no. : "+adb.getPhone()+" Address: "+adb.getAddress()+"\n");
    }
    
    AddressBook adb1 =  dao.getAll().get(0);
    adb1.setName("seul");
    dao.updateAddressBook(adb1);
    
    dao.getAddress(0);
     System.out.println("Name : "+adb1.getName()+" Phone no. : "+adb1.getPhone()+" Address: "+adb1.getAddress()+"\n");
  
  }
}