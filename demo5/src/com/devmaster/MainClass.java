package com.devmaster;

public class MainClass {

    public static void main(String[] args) {
        MyGenerics<String> stringGenerics= new MyGenerics<String>();
        MyGenerics<Integer> integerGenerics= new MyGenerics<Integer>();
        stringGenerics.setT(new String("Tôi yêu Việt Nam"));
        integerGenerics.setT(new Integer("2015"));
        System.out.println("Giá trị tại stringGenerics="+ stringGenerics.getT());
        System.out.println("Giá trị tại integerGenerics="+ integerGenerics.getT());

    }
}

