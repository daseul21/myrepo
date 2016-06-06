package com.j1.wk14.address;

import java.util.List;

public interface AddressBookDao{
  public List<AddressBook> getAll();
  public AddressBook getAddress(int phone);
  public void updateAddressBook(AddressBook addressbook);
  public void deleteAddressBook(AddressBook addressbook);
}