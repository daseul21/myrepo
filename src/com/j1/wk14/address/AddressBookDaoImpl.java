package com.j1.wk14.address;

import java.util.ArrayList;
import java.util.List;

public class AddressBookDaoImpl implements AddressBookDao{
  List<AddressBook> adrs;
  
  public AddressBookDaoImpl(){
    adrs = new ArrayList<AddressBook>();
    AddressBook ad1 = new AddressBook("kim",0,"dobong");
    AddressBook ad2 = new AddressBook("da",2,"seoul");
    
    adrs.add(ad1);
    adrs.add(ad2);
  }
  public void deleteAddressBook(AddressBook addressbook){
    adrs.remove(addressbook.getPhone());
    System.out.println("Person: Phone number : "+addressbook.getPhone()+", deleted from datatbase");
  }
  public List<AddressBook> getAll(){
    return adrs;
  }
  public AddressBook getAddress(int phone){
    return adrs.get(phone);
  }
  public void updateAddressBook(AddressBook addressbook){
    adrs.get(addressbook.getPhone()).setName(addressbook.getName());
    System.out.println("Person:  "+addressbook.getName()+", updated in the DB");
  }
}