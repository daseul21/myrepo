package com.j1.wk6.Calc;

import java.awt.*;
import java.awt.event.*;

public class Calc extends Frame implements ActionListener{
 private Panel pan, Pan1, Pan2, Pan3, Pan4, Pan5;
 private TextField tf;
 private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0;
 private Button CE, Equals, Divide, Multiply, Subtraction, Add;
 private int operator;  
 final static int ADD=1, SUB=2, MUL=3, DIV=4, NO=0, CONTINUE=5;
 private double num;  
 private boolean start; 
 private boolean next; 
  public void actionPerformed(ActionEvent e){
   if (e.getSource().equals(CE)){
     tf.setText("");
     start=true; 
     operator=NO;
     next=false;
     } else if (e.getSource().equals(Equals)){
       buttonEQ();
       start=true;
       operator=CONTINUE;
       next=false;
     } else if (e.getSource().equals(Divide)){
      if (next)
       buttonEQ();
      getPreNum();
      start=true;
      operator=DIV;
      next=false;
     } else if (e.getSource().equals(Multiply)){
      if (next) 
       buttonEQ();
      getPreNum();
      start=true;
      operator=MUL;
      next=false;
     } else if (e.getSource().equals(Subtraction)){
      if (next)
       buttonEQ();
      getPreNum();
      start=true;
      operator=SUB;
      next=false;
     } else if (e.getSource().equals(Add)){
      if (next)
       buttonEQ();
      getPreNum();
      start=true;
      operator=ADD;
      next=false;

     } else {
      if (start){
       tf.setText(e.getActionCommand());
       start=false;
       next=true;
      } else {
       tf.setText(tf.getText()+e.getActionCommand());
       next=true;
      }
     }
  } 
  void getPreNum(){
   num=Double.parseDouble(tf.getText());
  }
 void buttonEQ(){
  double result;
  boolean boolStr;
  double nowNum=Double.parseDouble(tf.getText());
  switch (operator){
  case ADD:
   result=num+nowNum;
   break;
  case SUB:
   result=num-nowNum;
   break;
  case MUL:
   result=num*nowNum;
   break;
  case DIV:
   result=num/nowNum;
   break;
  default :
   result=nowNum;
  }
  boolStr=((int)result==result);
  if (boolStr){
   tf.setText(((long)result)+"");
  } else {
   tf.setText(((double)result)+"");
  }
 }
 public Calc(String str, int x1, int y1, int x2, int y2){
  super(str);
  this.setSize(x1, y1);
  start=true;
  next=true;
  pan=new Panel();
  pan.setLayout(new GridLayout(5, 1));
  Pan1=new Panel();
  Pan2=new Panel();
  Pan3=new Panel();
  Pan4=new Panel();
  Pan5=new Panel();
  Pan1.setLayout(new GridLayout());
  Pan2.setLayout(new GridLayout());
  Pan3.setLayout(new GridLayout());
  Pan4.setLayout(new GridLayout());
  Pan5.setLayout(new GridLayout());
  tf=new TextField("");
  Pan1.add(tf);
  bt1=new Button("1");
  bt2=new Button("2");
  bt3=new Button("3");
  bt4=new Button("4");
  bt5=new Button("5");
  bt6=new Button("6");
  bt7=new Button("7");
  bt8=new Button("8");
  bt9=new Button("9");
  bt0=new Button("0");
  CE=new Button("CE");
  Equals=new Button("=");
  Divide=new Button("/");
  Multiply=new Button("*");
  Subtraction=new Button("-");
  Add=new Button("+");
  bt1.addActionListener(this);
  bt2.addActionListener(this);
  bt3.addActionListener(this);
  bt4.addActionListener(this);
  bt5.addActionListener(this);
  bt6.addActionListener(this);
  bt7.addActionListener(this);
  bt8.addActionListener(this);
  bt9.addActionListener(this);
  bt0.addActionListener(this);
  CE.addActionListener(this);
  Equals.addActionListener(this);
  Divide.addActionListener(this);
  Multiply.addActionListener(this);
  Subtraction.addActionListener(this);
  Add.addActionListener(this);
  Pan2.add(bt7);
  Pan2.add(bt8);
  Pan2.add(bt9);
  Pan3.add(bt4);
  Pan3.add(bt5);
  Pan3.add(bt6);
  Pan4.add(bt1);
  Pan4.add(bt2);
  Pan4.add(bt3);
  Pan5.add(bt0);
  Pan2.add(Subtraction);
  Pan3.add(Add);
  Pan4.add(Divide);
  Pan5.add(CE);
  Pan5.add(Equals);
  Pan5.add(Multiply);
  pan.add(Pan1);
  pan.add(Pan2);
  pan.add(Pan3);
  pan.add(Pan4);
  pan.add(Pan5);
  addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent we){
    System.exit(0);
   }
  });
  this.add(pan);
  this.setLocation(x2, y2);
 }
 public static void main(String[] args){
  Calc c=new Calc("calculator", 300, 300, 300, 200);
  c.setVisible(true);
 }
}
