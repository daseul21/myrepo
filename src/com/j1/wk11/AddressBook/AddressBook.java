package com.j1.wk11.AddressBook;

public class AddressBook{
  private String name;
  private String phoneNum;
  private String address;
  
  public AddressBook(String name, String phoneNum, String address){
    this.name = name;
    this.phoneNum = phoneNum;
    this.address = address;
  }
  
  public void print(){
    System.out.print(this.name+" : ");
    System.out.print(this.phoneNum+" ");
    System.out.println(this.address);
  }
}