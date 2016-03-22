package com.sd.wk3.hw1;


class Sorter{
  public Sorter(){}
  public static void sort(Object[] data, Comparator comp){
    
      for(int i=data.length-1; i>=1; i--) {
            int indexOfMin=0;
            for(int j=1; j<=i; j++) {
                if(comp.compare(data[j], data[indexOfMin]) < 0)
                    indexOfMin=j;
                }
                Object temp=data[i];
                data[i]=data[indexOfMin];
                data[indexOfMin]=temp;
}
}
}
interface Comparator{
  public int compare(Object o1, Object o2);
  public boolean equals(Object o);
}

class StringComparator implements Comparator{
  public StringComparator(){}
  public int compare(Object o1,Object o2){
    String s1=(String)o1;
    String s2=(String)o2;
    return s1.compareTo(s2);
  }
}



public class ReverseComparator{
  public static void main(String[] args){
    String[] B={"John","Adam","Skrien","Smith","Jones"};
    Comparator stringComp=new StringComparator();
    Sorter.sort(B,stringComp);
    
    for(int i=0; i<B.length;i++)
      System.out.println("B["+i+"]="+B[i]);
  }
}