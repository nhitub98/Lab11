package com.devmaster;

import com.sun.jdi.InterfaceType;

public class AdvancedComparion<T extends Comparable<T>> {
    public void maximum(T a, T b, T c){ //3 tham so kieu T
        T max=a;
        if(b.compareTo(a)>0){
            max=b;
        }
        if(c.compareTo(b)>0){
            max=c;
        }
        System.out.println("Maximum is" +max);
    }

    public static void main(String[] args) {
        AdvancedComparion<Integer> compInt= new AdvancedComparion<Integer>(); //khoi tao doi tuong
        AdvancedComparion<Float> compFloat= new AdvancedComparion<Float>();
        AdvancedComparion<String> compString= new AdvancedComparion<String>();
        compInt.maximum(9,3,6); //truyen gtri
        compFloat.maximum(8.5f,9.3f,2.6f);
        compString.maximum("Việt Nam", "Trung Quốc", "Hoa Kỳ");
    }
}
