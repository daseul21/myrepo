package com.sd.wk3.hw1;
import java.util.Arrays;

class Weight implements Comparable {
    private int kilo;
    Weight(int k) {
        kilo=k;
    }
    public int compareTo(Object o) {
        Weight w=(Weight)o;
        return this.kilo-w.kilo;
    }
    public String toString() {
        String msg=kilo+"";
        return msg;
    }
}

public class SorterMainV1 {
    public static void main(String[] args){
        Weight[] weights=new Weight[3];
        weights[0]=new Weight(50);
        weights[1]=new Weight(40);
        weights[2]=new Weight(70);
        Arrays.sort(weights);
        for(Weight w:weights)
            System.out.println(w.toString());
    }
}